package pl.oremczuk.springtutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import pl.oremczuk.springtutorial.api.Logger;
import pl.oremczuk.springtutorial.api.UsersRepository;
import pl.oremczuk.springtutorial.implementations.UsersRepositoryImpl;

public class RepositoriesConfiguration {
	
	@Autowired
	private Logger logger;
	
//	@Autowired
//	private LoggersConfiguration loggersConfiguration;

	@Bean
	public UsersRepository usersRepository() {
		
		UsersRepositoryImpl usersRepository = new UsersRepositoryImpl();
		usersRepository.setLogger(logger);
//		usersRepository.setLogger(loggersConfiguration.logger());
		return usersRepository;
	}
	
	
}
