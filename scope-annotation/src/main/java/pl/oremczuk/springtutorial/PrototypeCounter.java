package pl.oremczuk.springtutorial;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class PrototypeCounter extends Counter {
	
}
