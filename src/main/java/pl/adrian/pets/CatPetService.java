package pl.adrian.pets;

public class CatPetService implements PetService {

    @Override
    public String whichPetIsTheBest() {
        return "Cats are the best";
    }
}
