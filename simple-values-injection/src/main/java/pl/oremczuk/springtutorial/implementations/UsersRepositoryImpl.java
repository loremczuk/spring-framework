package pl.oremczuk.springtutorial.implementations;

import pl.oremczuk.springtutorial.api.Logger;
import pl.oremczuk.springtutorial.api.UsersRepository;
import pl.oremczuk.springtutorial.domain.User;

public class UsersRepositoryImpl implements UsersRepository {

	private Logger logger;

	public void setLogger(Logger logger) {
		this.logger = logger;

	}

	public User createUser(String name) {

		logger.log("Tworzenie u¿ytkownika: " + name);
		return new User(name);

	}

}
