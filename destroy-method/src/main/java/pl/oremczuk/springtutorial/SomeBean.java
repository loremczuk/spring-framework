package pl.oremczuk.springtutorial;

import org.springframework.beans.factory.DisposableBean;

public class SomeBean implements DisposableBean {

	public void checkIfWorks() {
		System.out.println("dzia³am w Mainie");
	}

	public void destroyMethod() {
		System.out.println("metoda z destroy-method");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("metoda z interfejsu");
		
	}
	
	
}
