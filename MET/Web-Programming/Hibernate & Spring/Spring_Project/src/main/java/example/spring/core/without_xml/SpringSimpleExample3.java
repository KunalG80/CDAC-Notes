package example.spring.core.without_xml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringSimpleExample3 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SpringConfig.class);
		//In the above code activities registration and refresh are done
		//implicitly.
		
		Object loadedObject = context.getBean("greeting3");
		Object loadedObject2 = context.getBean("greeting3");
		System.out.println(loadedObject == loadedObject2);
	}

}





