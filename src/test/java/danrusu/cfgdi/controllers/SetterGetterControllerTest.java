package danrusu.cfgdi.controllers;

import danrusu.cfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by rusud on 30.08.2023
 */
class SetterGetterControllerTest {

   SetterGetterController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterGetterController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreetingService());
    }
}