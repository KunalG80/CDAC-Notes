package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLoadingAndScopeExample {

	public static void main(String[] args) {
		String fileName = "spring-config2.xml";
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(fileName);
		Object obj = context.getBean("bean1");
		Object obj2 = context.getBean("bean1");
		context.getBean("bean1");
		context.getBean("bean1");
		context.getBean("bean1");
		System.out.println("Is it the same object? " + (obj == obj2));

	}

}
