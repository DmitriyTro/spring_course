package spring_introduction;

import org.springframework.context.annotation.*;

import java.util.concurrent.CancellationException;

@Configuration
@PropertySource("classpath:myApp.properties")
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
