package pl.adrian.pets;

public class DogPetService implements PetService {

    @Override
    public String whichPetIsTheBest() {
        return "Dogs are the best !!!";
    }
}
