package com.testyantra.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.testyantra.jpawithhibernate.manytoone.Pencil;
import com.testyantra.jpawithhibernate.manytoone.PencilBox;

public class TestManyToOne {

	public static void main(String[] args) {
		PencilBox pebox = new PencilBox();
		pebox.setBid(1);
		pebox.setBname("apsara");
		
		Pencil p1 = new Pencil();
		p1.setPid(11);
		p1.setColor("black");
		p1.setPencilbox(pebox);
 
		
		Pencil p2 = new Pencil();
		p2.setPid(12);
		p2.setColor("blue");
		p2.setPencilbox(pebox);
		
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(p1);
			entityManager.persist(p2);
			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
			entityManager.close();
			
		}
	}

