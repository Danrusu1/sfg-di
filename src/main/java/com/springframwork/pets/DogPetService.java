package com.springframwork.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by rusud on 30.08.2023
 */
@Profile("DOG")
@Service("petService")
public class DogPetService implements PetService {
    @Override
    public String getPetType() {
        return "Dogs Are the Best!";
    }
}
