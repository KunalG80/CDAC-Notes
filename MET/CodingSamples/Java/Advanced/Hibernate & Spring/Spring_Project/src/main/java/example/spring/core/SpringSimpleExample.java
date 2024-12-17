package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSimpleExample {

	public static void main(String[] args) {
		/* This program obtains the bean against its ID from Spring's 
		 * configuration unit and invokes its method. 
		 */
		ApplicationContext context;
		String filePath = "./src/main/resources/spring-config.xml";
		context = new FileSystemXmlApplicationContext(filePath);
		Object loadedObject = context.getBean("myBean");
		GreetingService gs = (GreetingService)loadedObject;
		String reply = gs.sayGreeting();
		System.out.println(reply);
		
	}

}






