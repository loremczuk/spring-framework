package pl.oremczuk.springtutorial;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String args[]) {
	
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	context.registerShutdownHook();
	
	SomeBean someBean = context.getBean("someBean", SomeBean.class);

	someBean.checkIfWorks();
	
	
	
//	((ClassPathXmlApplicationContext) context).close();
	
	}
}
