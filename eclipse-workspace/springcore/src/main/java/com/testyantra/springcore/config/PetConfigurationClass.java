package com.testyantra.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.testyantra.springcore.di.Cat;
import com.testyantra.springcore.di.Dog;
import com.testyantra.springcore.di.Pet;

@Configuration
public class PetConfigurationClass {

	@Bean(name="dog")
	public Dog getDog() {
		return new Dog();
	}
	
	@Bean(name="cat")
	public Cat getCat() {
		return new Cat();
		
	}
	@Bean(name="pet")
	public Pet getPet() {
		Pet pet = new Pet(); 
			pet.setName("Bittu");
			//pet.setAnimal(getDog());//here it wont create a second method only one method will be created for "dog" and here we are doing wiring
			return pet;
		}
	

}
