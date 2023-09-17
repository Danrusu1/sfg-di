package danrusu.cfgdi.services;

/**
 * Created by rusud on 30.08.2023
 */
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! - constructor";
    }
}
