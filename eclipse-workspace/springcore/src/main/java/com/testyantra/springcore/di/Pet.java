package com.testyantra.springcore.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("pet")
public class Pet {
	
	public Pet() {
		
	}
	//@annotation is used in constructor only if all the arguments are defined as bean else dont use
	public Pet(String name,Animal animal) {
		this.name = name;
		this.animal= animal;
	}

	private String name;
	@Autowired
	@Qualifier("cat")//it will qualify this cat,if we are not using this we will get an exception because above cat we have dog 
	//as cat is animal we will get a doubt of which to choose so in @qualifier we are specifying the name 
	private Animal animal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	
}
