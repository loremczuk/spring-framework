package pl.oremczuk.springtutorial.api;

import pl.oremczuk.springtutorial.domain.User;

public interface UsersRepository {
	
	User createUser(String name);
	void setLogger(Logger logger);

}
