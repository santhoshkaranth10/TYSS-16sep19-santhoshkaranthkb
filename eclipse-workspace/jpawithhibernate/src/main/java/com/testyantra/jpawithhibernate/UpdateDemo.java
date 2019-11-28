package com.testyantra.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.testyantra.jpawithhibernate.dto.Product;

public class UpdateDemo {

	public static void main(String[] args) {

		EntityManager entityManager  = null;
		EntityTransaction entityTransaction = null;

		try {
			EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			Product product = entityManager.find(Product.class,102);
			product.setPname("bike");
			System.out.println("updated record");
			entityTransaction.commit();
		} catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();


	}
}
