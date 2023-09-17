package com.springframwork.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by rusud on 30.08.2023
 */
@Profile({"CAT", "default"})
@Service("petService")
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
