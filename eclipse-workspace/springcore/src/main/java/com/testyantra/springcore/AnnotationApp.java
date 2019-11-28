package com.testyantra.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.testyantra.springcore.config.HelloConfigurationClass;
import com.testyantra.springcore.di.Hello;
import com.testyantra.springcore.di.Pet;

public class AnnotationApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloConfigurationClass.class);//here instead of bean class we are creating a configuration class
		//using annotaion and passing it inside "AnnotationConfigApplicationContext" as "ConfigurationClass.class"
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getMsg());
		
		Hello hello2 = context.getBean(Hello.class);
		
		System.out.println(hello);
		System.out.println(hello2);
		
		
		//Animal animal = context.getBean(Animal.class);
		//animal.makeSound();
	   
		System.out.println("***********");
	    
	    Pet pet = context.getBean(Pet.class);
	    pet.getName();
	    pet.getAnimal().makeSound();
	
	    context.close();//if we have scope as protocol destroy method wont execute
	}
}
