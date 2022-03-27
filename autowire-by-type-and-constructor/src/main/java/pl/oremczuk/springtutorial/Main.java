package pl.oremczuk.springtutorial;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String args[]) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	
	Application application = context.getBean("aplikacja", Application.class);
	
	System.out.println(application.getUsersRepository().exists("D¿ord¿"));
	System.out.println(application.getDictionaryRepository().getMapValue());
	
	}
}
