package example.spring.core.without_xml;

import org.springframework.stereotype.Component;

@Component //Marks this class as a component so that Spring can manage it
public class TestComponent {
	public void doTest() {
		System.out.println("TestComponent succeeded.");
	}
}
