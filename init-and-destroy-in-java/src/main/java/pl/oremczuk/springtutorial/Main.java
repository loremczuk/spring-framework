package pl.oremczuk.springtutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Main {

	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

		context.getBean("someBean");
		
		context.close();
		
//		((ClassPathXmlApplicationContext) context).close();
		

	}

}
