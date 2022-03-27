package pl.oremczuk.springtutorial;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SomeBean implements InitializingBean, DisposableBean {

	private Logger logger = Logger.getLogger(SomeBean.class.getName());
	
	
	public void destroy() throws Exception {
		logger.info("destroy");
	}

	public void afterPropertiesSet() throws Exception {
		logger.info("afterPropertiesSet");
		
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}
	
	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy");
		
	}

	public void myInitMethod () {
		logger.info("myInitMethod");
	}
	
	public void myDestroyMethod() {
		logger.info("myDestroyMethod");
	}
}
