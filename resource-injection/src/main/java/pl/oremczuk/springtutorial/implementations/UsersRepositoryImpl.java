package pl.oremczuk.springtutorial.implementations;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import pl.oremczuk.springtutorial.api.Logger;
import pl.oremczuk.springtutorial.api.UsersRepository;
import pl.oremczuk.springtutorial.domain.User;

@Service("usersRepository")
public class UsersRepositoryImpl implements UsersRepository {

	@Resource(name = "logger")
	private Logger ble;

//	@Resource
	public void setLogger(Logger abc) {
		this.ble = abc;

	}

	public User createUser(String name) {

		ble.log("Tworzenie u¿ytkownika: " + name);
		return new User(name);

	}

}
