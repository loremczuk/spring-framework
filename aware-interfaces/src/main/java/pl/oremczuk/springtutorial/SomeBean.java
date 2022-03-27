package pl.oremczuk.springtutorial;

import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SomeBean implements BeanNameAware, ApplicationContextAware {

	private String name;
	private ApplicationContext applicationContext;
	
	@Override
	public void setBeanName(String name) {
		this.name = name;
	}

	public void init() {
		applicationContext.getBeansOfType(SomeBean.class);
		Map<String, SomeBean> beansOfType = applicationContext.getBeansOfType(SomeBean.class);
		System.out.println("Nazywam siê " + name + " i jest nas beanów " + beansOfType.size());
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		
	}
	
}
