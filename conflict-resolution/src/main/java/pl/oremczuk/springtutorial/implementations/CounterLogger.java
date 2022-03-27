package pl.oremczuk.springtutorial.implementations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import pl.oremczuk.springtutorial.api.Logger;

@Service
@Qualifier("counterLoggerAnnotationQualifier")
public class CounterLogger implements Logger {

	private int counter;
	
	public void log(String message) {
		System.out.println(counter++ + ": " + message);

	}

}
