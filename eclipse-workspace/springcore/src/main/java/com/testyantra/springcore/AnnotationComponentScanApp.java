package com.testyantra.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.testyantra.springcore.config.ComponentScanConfiguration;
import com.testyantra.springcore.di.Hello;
import com.testyantra.springcore.di.Pet;

public class AnnotationComponentScanApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
		
		Hello hello = context.getBean(Hello.class);
		hello.setMsg("i love java");
		System.out.println(hello.getMsg());
		
		
		Pet pet = context.getBean(Pet.class);
		pet.setName("google");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
	}
}
