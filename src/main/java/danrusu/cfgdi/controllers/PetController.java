package danrusu.cfgdi.controllers;

import com.springframwork.pets.PetService;
import org.springframework.stereotype.Controller;

/**
 * Created by rusud on 30.08.2023
 */

@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest() {
        return petService.getPetType();
    }
}
