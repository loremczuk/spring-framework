package pl.oremczuk.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String args[]) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	User user = context.getBean("someUser", User.class);
	System.out.println(user);
	
	}
}
