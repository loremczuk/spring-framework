package pl.oremczuk.springtutorial;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
	
	public static void main(String args[]) {
	
//	Locale.getDefault();
//	Locale locale = Locale.getDefault();
	GregorianCalendar.getInstance();
	Calendar calendar = GregorianCalendar.getInstance();
	SimpleDateFormat.getInstance();
	DateFormat formatter = SimpleDateFormat.getInstance();
	
	System.out.println(formatter.format(calendar.getTime()));
	
	}
}
