package example.spring.core.without_xml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringSimpleExample {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext();
		//Registering configuration specific class: SpringConfig with
		//AnnotationConfigApplicationContext
		context.register(SpringConfig.class);
		context.refresh();//Refreshing the context to apply the changes.
		Object loadedObject = context.getBean("getGreeting");
		System.out.println(loadedObject);
	}

}





