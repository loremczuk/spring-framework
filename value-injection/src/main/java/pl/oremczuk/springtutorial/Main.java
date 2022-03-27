package pl.oremczuk.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.oremczuk.springtutorial.api.UsersRepository;
import pl.oremczuk.springtutorial.domain.User;
import pl.oremczuk.springtutorial.implementations.DateLogger;
import pl.oremczuk.springtutorial.implementations.UsersRepositoryImpl;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:context.xml");

		UsersRepository usersRepository = context.getBean("usersRepository", UsersRepositoryImpl.class);
		User user = usersRepository.createUser("Unikorna");
		
		
	}

}
