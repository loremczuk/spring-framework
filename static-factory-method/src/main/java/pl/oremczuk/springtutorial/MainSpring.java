package pl.oremczuk.springtutorial;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
	
	public static void main(String args[]) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
	context.getBean("calendar", Calendar.class);
	Calendar calendar = context.getBean("calendar", Calendar.class);
	context.getBean("formatter");
	DateFormat formatter = (DateFormat) context.getBean("formatter");
	
	System.out.println(formatter.format(calendar.getTime()));
	
	
	}
}
