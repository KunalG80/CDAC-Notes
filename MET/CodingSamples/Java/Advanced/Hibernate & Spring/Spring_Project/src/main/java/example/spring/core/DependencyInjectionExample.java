package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionExample {

	public static void main(String[] args) {
		String fileName = "spring-config.xml";
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(fileName);
		Object loadedObject = context.getBean("myUserBean");
		GreetingService gs = (GreetingService)loadedObject;
		String reply = gs.sayGreeting();
		System.out.println(reply);
		System.out.println("-----------------------------");
		loadedObject = context.getBean("myUserBean2");
		gs = (GreetingService)loadedObject;
		reply = gs.sayGreeting();
		System.out.println(reply);
		
		
	}

}
