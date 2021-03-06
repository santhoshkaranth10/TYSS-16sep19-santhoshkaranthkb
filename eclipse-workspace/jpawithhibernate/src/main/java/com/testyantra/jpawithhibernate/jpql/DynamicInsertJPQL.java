package com.testyantra.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicInsertJPQL {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		 entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		String jpql = "insert into Product values(pid,pname,quantity) values (:id ,:name,:quantity)";
		Query query = entityManager.createNativeQuery(jpql);
		query.setParameter("name", "rubber");
		query.setParameter("id", 103);
		query.setParameter("quantity", 2);
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

