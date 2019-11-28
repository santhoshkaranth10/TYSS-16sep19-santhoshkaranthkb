package com.testyantra.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testyantra.springcore.di.Hello;
import com.testyantra.springcore.di.Pet;

public class XMLComponentsScanApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Hello hello = context.getBean(Hello.class);
		hello.setMsg("i love java");
		System.out.println(hello.getMsg());
		
		
		Pet pet = context.getBean(Pet.class);
		pet.setName("siri");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
	}
}
