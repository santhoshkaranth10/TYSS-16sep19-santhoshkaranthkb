package com.testyantra.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.testyantra.springcore.di.Hello;

@Configuration
@Import(PetConfigurationClass.class)
public class HelloConfigurationClass {

	@Bean(name="hello")
	//@Scope("prototype")//instead of writing like below code we can also write in this way
	//if we don't erase "scope" here destroy method wont execute
	public Hello getHello() {
		Hello hello =new Hello();
		hello.setMsg("i love python");
		return hello;
	}
//	public Hello getHello() {
//		return new Hello();
//	}
		}

