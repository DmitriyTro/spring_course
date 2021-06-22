package spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.concurrent.CancellationException;

@Configuration
//@ComponentScan("spring_introduction")
public class MyConfig {

	@Bean
	@Scope("prototype")
	public Pet catBean() { //bean id is method name
		System.out.println("!!!");
		return new Cat();
	}

	@Bean
	public Person personBean() {
		return new Person((catBean()));
	}
}
