package danrusu.cfgdi.controllers;

import danrusu.cfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by rusud on 30.08.2023
 */

@Controller
public class MyController {

    public final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
