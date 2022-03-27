package pl.oremczuk.springtutorial;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String args[]) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	SomeBean someBean = context.getBean("someBean", SomeBean.class);
	System.out.println(someBean.getStringList());
	System.out.println(someBean.getIntegerSet());
	System.out.println(Arrays.toString(someBean.getLongsTable()));
	
	System.out.println(someBean.getStringList2());
	
	}
}
