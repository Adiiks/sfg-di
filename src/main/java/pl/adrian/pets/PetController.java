package pl.adrian.pets;

import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    public String whichPetIsTheBest() {
        return "Dog";
    }
}
