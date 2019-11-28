package com.testyantra.jpawithhibernate.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="pencil")
public class Pencil {

    @Id
	@Column
	private int pid;
	@Column
	private String color;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="bid" , nullable = false)//here we are writing to make sure that the foreign key
	//is not null
	private PencilBox pencilbox;
}
