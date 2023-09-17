package danrusu.cfgdi;

import danrusu.cfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"danrusu.cfgdi", "com.springframwork.pets"})
@SpringBootApplication
public class CfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CfgDiApplication.class, args);

		System.out.println("-------- Pet Service");
		PetController petController = context.getBean("petController", PetController.class);
		System.out.println(petController.whichPetIsTheBest());

		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("-------- Primary Bean");
		MyController myController = (MyController) context.getBean("myController");
		System.out.println(myController.sayHello());

		System.out.println("-------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreetingService());

		System.out.println("-------- Setter");
		SetterGetterController setterGetterController = (SetterGetterController) context.getBean("setterGetterController");
		System.out.println(setterGetterController.getGreetingService());

		System.out.println("-------- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());


	}

}
