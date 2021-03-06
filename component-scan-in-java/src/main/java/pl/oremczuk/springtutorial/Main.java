package pl.oremczuk.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.oremczuk.springtutorial.api.UsersRepository;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

		UsersRepository usersRepository = context.getBean("usersRepository", UsersRepository.class);

		usersRepository.createUser("Unikorna");

	}

}
