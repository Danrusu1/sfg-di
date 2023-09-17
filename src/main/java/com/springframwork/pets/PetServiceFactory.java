package com.springframwork.pets;

import org.springframework.stereotype.Service;

/**
 * Created by rusud on 17.09.2023
 */
public class PetServiceFactory {

    public PetService getPetService(String petType) {
        switch (petType) {
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
