package pl.oremczuk.springtutorial.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import pl.oremczuk.springtutorial.api.Logger;
import pl.oremczuk.springtutorial.api.UsersRepository;
import pl.oremczuk.springtutorial.domain.User;

@Service("usersRepository")
public class UsersRepositoryImpl implements UsersRepository {

	@Autowired
	@Qualifier("dateLoggerXmlQualifier")
	private Logger logger;

	public void setLogger(Logger logger) {
		this.logger = logger;

	}

	public User createUser(String name) {

		logger.log("Tworzenie użytkownika: " + name);
		return new User(name);

	}

}
