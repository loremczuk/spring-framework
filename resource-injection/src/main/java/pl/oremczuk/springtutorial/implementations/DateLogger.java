package pl.oremczuk.springtutorial.implementations;

import java.util.Date;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import pl.oremczuk.springtutorial.api.Logger;

@Service("logger")
public class DateLogger implements Logger {

	public void log(String message) {
		System.out.println(new Date() + ": " + message);

	}

}
