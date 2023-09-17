package com.springframwork.pets;

/**
 * Created by rusud on 30.08.2023
 */
//@Profile("dog")
//@Service("petService")
public class DogPetService implements PetService {
    @Override
    public String getPetType() {
        return "Dogs Are the Best!";
    }
}
