package com.testyantra.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ExecuteInsertJPQL {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		 entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		String jpql ="insert into Product (pid,pname,quantity) values(105,'brush',10)";
		Query query = entityManager.createNativeQuery(jpql);
		int result = query.executeUpdate();
		System.out.println("result is "+result);
        entityTransaction.commit();		
	}catch(Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
		entityManager.close();
}


	}
