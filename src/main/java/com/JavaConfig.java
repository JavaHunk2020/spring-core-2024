package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.p1.Dog;

@Configuration
@ComponentScan("com.p1")
public class JavaConfig {
	
	//Making this return dog object as bean
	@Bean
	public Dog createBean() {
		return new Dog();
	}

}
