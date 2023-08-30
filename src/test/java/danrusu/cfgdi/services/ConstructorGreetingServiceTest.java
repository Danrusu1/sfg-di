package danrusu.cfgdi.services;

import danrusu.cfgdi.controllers.PropertyInjectedController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by rusud on 30.08.2023
 */
class ConstructorGreetingServiceTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void sayGreeting() {
        System.out.println(controller.getGreetingService());
    }
}