package danrusu.cfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by rusud on 30.08.2023
 */

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello World!");

        return "Hi Folks!";
    }
}
