package com.adrian.sfgdi;

import com.adrian.sfgdi.controllers.ConstructedInjectedController;
import com.adrian.sfgdi.controllers.MyController;
import com.adrian.sfgdi.controllers.PropertyInjectedController;
import com.adrian.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

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