package com.testyantra.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.testyantra.jpawithhibernate.dto.Product;

public class ReadDemo {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Product productDetail = entityManager.find(Product.class, 101);//find method is used to the find the data from the database
        System.out.println("ID"+productDetail.getPid());
        System.out.println("NAME"+productDetail.getPname());
        System.out.println("QUANTITY"+productDetail.getQuantity());
        entityManager.close();
	}
}
