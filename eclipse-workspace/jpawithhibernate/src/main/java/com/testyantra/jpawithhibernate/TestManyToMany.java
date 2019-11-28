package com.testyantra.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.testyantra.jpawithhibernate.manytomany.Course;
import com.testyantra.jpawithhibernate.manytomany.Student;

public class TestManyToMany {

	public static void main(String[] args) {


		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;


		Course c1 = new Course();
		c1.setCid(10);
		c1.setCname("java");

		Course c2 = new Course();
		c2.setCid(11);
		c2.setCname("sql");

		Course c3 = new Course();
		c3.setCid(12);
		c3.setCname("hibernate");

		ArrayList<Course> al = new ArrayList<Course>();
		al.add(c1);
		al.add(c2);
		al.add(c3);


		Student student = new Student();
		student.setSid(1);
		student.setSname("santhosh");
		student.setCourse(al);//if we write "course" in place of "al" we will get an error


		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(student);
			//entityManager.persist(student1);

			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();

		}
		entityManager.close();


	}
}