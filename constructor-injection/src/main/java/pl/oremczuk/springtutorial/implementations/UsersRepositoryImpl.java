package pl.oremczuk.springtutorial.implementations;

import pl.oremczuk.springtutorial.api.Logger;
import pl.oremczuk.springtutorial.api.UsersRepository;
import pl.oremczuk.springtutorial.domain.User;

public class UsersRepositoryImpl implements UsersRepository {

	private Logger logger;

	public UsersRepositoryImpl(Logger logger, String localisation, String dbName) {
		this.logger = logger;
		logger.log("Lokalizacja repozytorium: " + localisation + dbName);
	}

	public User createUser(String name) {

		logger.log("Tworzenie użytkownika: " + name);
		return new User(name);

	}

}
