package example.spring.core.without_xml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PureAnnotationBasedConfigurationExample {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SpringConfig2.class);
		TestComponent testComp = context.getBean(TestComponent.class);
		testComp.doTest();
	}

}
