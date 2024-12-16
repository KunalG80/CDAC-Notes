package example.spring.core.without_xml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringSimpleExample2 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SpringConfig.class);
		//In the above code activities registration and refresh are done
		//implicitly.
		
		Object loadedObject = context.getBean("greeting2");
		System.out.println(loadedObject);
	}

}





