package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanWiringExample {

	public static void main(String[] args) {
		String fileName = "spring-config.xml";
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(fileName);
		Object loadedObject = context.getBean("myCustomerBean");
		System.out.println(loadedObject);

	}

}
