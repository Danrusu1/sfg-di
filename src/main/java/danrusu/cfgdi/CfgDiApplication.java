package danrusu.cfgdi;

import danrusu.cfgdi.controllers.ConstructorInjectedController;
import danrusu.cfgdi.controllers.MyController;
import danrusu.cfgdi.controllers.PropertyInjectedController;
import danrusu.cfgdi.controllers.SetterGetterController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CfgDiApplication.class, args);

		MyController myController = (MyController) context.getBean("myController");

		String greeting = myController.sayHello();
		System.out.println(greeting);

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
