package pl.oremczuk.springtutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pl.oremczuk.springtutorial.api.Logger;
import pl.oremczuk.springtutorial.api.UsersRepository;
import pl.oremczuk.springtutorial.implementations.DateLogger;
import pl.oremczuk.springtutorial.implementations.UsersRepositoryImpl;

@Configuration
@ComponentScan(basePackages = "pl.oremczuk.springtutorial.implementations")
public class AppConfiguration {

//	@Bean
//	public Logger logger() {
//		return new DateLogger();
//	}
//	
//	@Bean
//	public UsersRepository usersRepository() {
//		
//		UsersRepositoryImpl usersRepository = new UsersRepositoryImpl();
//		usersRepository.setLogger(logger());
//		return usersRepository;
//	}
	
}
