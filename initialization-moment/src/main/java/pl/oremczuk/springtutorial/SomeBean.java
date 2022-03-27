package pl.oremczuk.springtutorial;

import org.springframework.beans.factory.InitializingBean;

public class SomeBean implements InitializingBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("inicjalizacja beana");
		
	}
}
