package danrusu.cfgdi.services;

import danrusu.cfgdi.repositories.EnglishGreetingRepository;

/**
 * Created by rusud on 30.08.2023
 */
public class I18nEnglishGreetingService implements GreetingService{

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return englishGreetingRepository.getGreeting();
    }
}
