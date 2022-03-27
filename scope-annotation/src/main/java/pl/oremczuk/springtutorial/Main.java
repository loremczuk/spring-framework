package pl.oremczuk.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:context.xml");
		
		UsersCounter usersCounter = context.getBean("usersCounter", UsersCounter.class);
		
		System.out.println("usersCounter.getPrototypeCounter1().getCounter()");
		System.out.println(usersCounter.getPrototypeCounter1().getCounter());
		System.out.println(usersCounter.getPrototypeCounter1().getCounter());
		System.out.println("usersCounter.getPrototypeCounter2().getCounter()");
		System.out.println(usersCounter.getPrototypeCounter2().getCounter());
		System.out.println(usersCounter.getPrototypeCounter2().getCounter());
		System.out.println("usersCounter.getSingletonCounter1().getCounter()");
		System.out.println(usersCounter.getSingletonCounter1().getCounter());
		System.out.println(usersCounter.getSingletonCounter1().getCounter());
		System.out.println("usersCounter.getSingletonCounter2().getCounter()");
		System.out.println(usersCounter.getSingletonCounter2().getCounter());
		System.out.println(usersCounter.getSingletonCounter2().getCounter());
		
	}

}
