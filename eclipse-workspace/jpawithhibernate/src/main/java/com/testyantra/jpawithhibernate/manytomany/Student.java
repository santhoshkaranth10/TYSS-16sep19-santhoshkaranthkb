package com.testyantra.jpawithhibernate.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="student")
public class Student {

	@Id
	@Column(name="sid")
	private int sid;
	
	@Column(name="sname")
	private String sname;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="student_course",joinColumns = @JoinColumn(name="sid"),inverseJoinColumns = @JoinColumn(name="cid"))
	private List<Course> course;
	
}