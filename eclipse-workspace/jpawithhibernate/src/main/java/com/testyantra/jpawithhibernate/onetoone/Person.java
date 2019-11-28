package com.testyantra.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="person")
public class Person {

	@Id
	@Column
	private int pid;
	@Column
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="vid")//this annotataion is used only for the primarykey 
	private VoterCard voterCard;//even this contains getters and setters method
	
}