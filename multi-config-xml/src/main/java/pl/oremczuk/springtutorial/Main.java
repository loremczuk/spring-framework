package pl.oremczuk.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.oremczuk.springtutorial.api.UsersRepository;

public class Main {

	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext("repositories.xml", "loggers.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		context.getBean("usersRepository", UsersRepository.class).createUser("Unikorna");
	}

}
