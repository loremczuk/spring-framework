package pl.oremczuk.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String args[]) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
	String someString = context.getBean("someString", String.class);
	System.out.println(someString);
	
	}
}
