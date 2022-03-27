package pl.oremczuk.springtutorial;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import pl.oremczuk.springtutorial.api.Logger;
import pl.oremczuk.springtutorial.implementations.DateLogger;

@Configuration
public class LoggersConfiguration {

	@Bean
//	@Scope(BeanDefinition.SCOPE_PROTOTYPE)
//	@Scope("prototype")
	public Logger logger() {
		return new DateLogger();
	}
	
}
