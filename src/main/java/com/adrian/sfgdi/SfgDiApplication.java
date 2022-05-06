package com.adrian.sfgdi;

import com.adrian.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import pl.adrian.pets.PetController;

@ComponentScan(basePackages = {"com.adrian.sfgdi", "pl.adrian.pets"})
@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		PetController petController = (PetController) ctx.getBean("petController");
		System.out.println("Which pet is the best: " + petController.whichPetIsTheBest());

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println("-----Primary Bean-----");
		System.out.println(controller.sayHello());

		System.out.println("-----Property-----");
		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------Setter-----");
		SetterInjectedController setterInjectedController =
				(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-----Constructor-----");
		ConstructedInjectedController constructedInjectedController =
				(ConstructedInjectedController) ctx.getBean("constructedInjectedController");
		System.out.println(constructedInjectedController.getGreeting());
	}

}
