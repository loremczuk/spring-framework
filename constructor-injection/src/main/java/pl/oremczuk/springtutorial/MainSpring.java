package pl.oremczuk.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.oremczuk.springtutorial.api.UsersRepository;
import pl.oremczuk.springtutorial.implementations.UsersRepositoryImpl;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
//		context.getBean("myRepository", UsersRepositoryImpl.class);
		UsersRepository usersRepository = context.getBean("myRepository", UsersRepositoryImpl.class);
		usersRepository.createUser("Unikorna");
		((ClassPathXmlApplicationContext) context).close();

	}

}
