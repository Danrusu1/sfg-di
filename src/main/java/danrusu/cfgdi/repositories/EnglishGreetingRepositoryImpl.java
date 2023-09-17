package danrusu.cfgdi.repositories;

/**
 * Created by rusud on 17.09.2023
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
