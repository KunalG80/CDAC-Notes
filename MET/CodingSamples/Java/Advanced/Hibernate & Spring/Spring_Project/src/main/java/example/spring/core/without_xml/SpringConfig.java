package example.spring.core.without_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration //Marks this class as a configuration specific class.
public class SpringConfig {
	@Bean //Marks this method as a bean declaration method.
	public Greeting getGreeting() {
		Greeting greetingObject = new Greeting();
		greetingObject.setTo("All");
		greetingObject.setFrom("Me");
		greetingObject.setContent("Merry Christmas");
		return greetingObject;
	}
	@Bean("greeting2") //Changing the ID from default to greeting2
	public Greeting getGreeting2() {
		Greeting greetingObject = 
				new Greeting("All", "Me", "Happy New year 2025");
		return greetingObject;
	}
	
	@Bean("greeting3")
	@Lazy //Equivalent to lazy-init = "true"
	@Scope("prototype")//Equivalent to scope = "prototype"
	public Greeting getGreeting3() {
		Greeting greetingObject = 
				new Greeting("All", "Me", "Bye Bye 2024");
		return greetingObject;
	}
}



