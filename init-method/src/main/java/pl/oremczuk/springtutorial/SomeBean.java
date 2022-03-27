package pl.oremczuk.springtutorial;

import org.springframework.beans.factory.InitializingBean;

public class SomeBean implements InitializingBean {

	public void init() {
		System.out.println("Inicjalizacja beana");
	}
	
	public void checkIfWorks () {
		System.out.println("dzia³am w Mainie");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inicjalizacja metody interfejsu");
		
	}
}
