package danrusu.cfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by rusud on 30.08.2023
 */
@Service
public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
            return "Hello World! - setter";
    }
}