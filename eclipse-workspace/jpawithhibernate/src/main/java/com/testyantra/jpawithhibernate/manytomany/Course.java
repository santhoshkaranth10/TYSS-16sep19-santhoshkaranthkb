package com.testyantra.jpawithhibernate.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Entity
@Data
@Table(name="course")
public class Course {

	
	@Id
	@Column(name="cid")
	private int cid;
	
	@Column(name="cname")
	private String cname;
	
	@Exclude
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "course")
	private List<Student> student;
	
}