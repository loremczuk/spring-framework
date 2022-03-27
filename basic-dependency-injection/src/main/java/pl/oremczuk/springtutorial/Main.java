package pl.oremczuk.springtutorial;

import pl.oremczuk.springtutorial.api.Logger;
import pl.oremczuk.springtutorial.api.UsersRepository;
import pl.oremczuk.springtutorial.domain.User;
import pl.oremczuk.springtutorial.implementations.LoggerImpl;
import pl.oremczuk.springtutorial.implementations.UsersRepositoryImpl;

public class Main {
	
	public static void main(String args[]) {
	
	Logger logger = new LoggerImpl();
	UsersRepository usersRepository = new UsersRepositoryImpl();
	usersRepository.setLogger(logger);
	usersRepository.createUser("Rudolf");
//	User user = usersRepository.createUser("Franek");
	
	}
}
