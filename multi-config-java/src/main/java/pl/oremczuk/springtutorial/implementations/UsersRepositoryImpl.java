package pl.oremczuk.springtutorial.implementations;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

import pl.oremczuk.springtutorial.api.Logger;
import pl.oremczuk.springtutorial.api.UsersRepository;
import pl.oremczuk.springtutorial.domain.User;

//@Service
public class UsersRepositoryImpl implements UsersRepository {

//	@Autowired
	private Logger logger;

	public User createUser(String name) {

		if (logger != null) {
			logger.log("Tworzenie u¿ytkownika: " + name);
		}
		return new User(name);

	}

	public void setLogger(Logger logger) {
		this.logger = logger;

	}

}
