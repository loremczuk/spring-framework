package pl.oremczuk.springtutorial;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String args[]) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	
	Component1 component1 = context.getBean("component1", Component1.class);
	Component2 component2 = context.getBean("component2", Component2.class);
	
	System.out.println(component1.getUsersRepository().getIncrementedNumber());
	System.out.println(component2.getUsersRepository().getIncrementedNumber());

	System.out.println(context.getBean("usersRepository", UsersRepository.class).getIncrementedNumber());
	System.out.println(context.getBean("usersRepository", UsersRepository.class).getIncrementedNumber());
	System.out.println(context.getBean("usersRepository", UsersRepository.class).getIncrementedNumber());
	
	}
}
