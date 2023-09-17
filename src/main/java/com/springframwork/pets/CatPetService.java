package com.springframwork.pets;

/**
 * Created by rusud on 30.08.2023
 */
//@Profile({"cat", "default"})
//@Service("petService")
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
