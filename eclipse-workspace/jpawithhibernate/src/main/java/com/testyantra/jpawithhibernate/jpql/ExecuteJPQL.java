package com.testyantra.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ExecuteJPQL {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//String jpql = "from Product";//here we are retrieving all the data from table
	    String jpql1 = "select pname from Product";//after from we have entityclass name
	    //here pname is the variable which we have declared in product class
		Query query = entityManager.createQuery(jpql1);//creating the object of query using entityManager 
      List<String> productDetails = query.getResultList();
      for (String string : productDetails) {
		System.out.println("name "+string);
	}
		// List<Product> productDetails= query.getResultList();//as it is a list we need to store the results in collection list
//	    for (Product product : productDetails) {
//			System.out.println("id" +product.getPid());
//			System.out.println("name" +product.getPname());
//			System.out.println("quantity" +product.getQuantity());
//			
		
	    entityManager.close();
	}
}


//query to display only names