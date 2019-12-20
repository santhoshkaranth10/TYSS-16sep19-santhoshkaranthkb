package com.tyss.springbootwithhibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tyss.springbootwithhibernate.dto.Products_Info;

@Repository
public class StockDAOImpl implements StockDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean addProduct(Products_Info info) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(info);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateProduct(Products_Info info) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Products_Info p1 = manager.find(Products_Info.class, info.getId());
			p1.setCategory(info.getCategory());
			p1.setCompany(info.getCompany());
			p1.setName(info.getName());
			p1.setPrice(info.getPrice());
			p1.setQuantity(info.getQuantity());
			transaction.commit();
			return true;
		
	}

	@Override
	public Products_Info getProductByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from Products_Info where name=:name";
			TypedQuery<Products_Info> typedQuery = manager.createQuery(jpql,Products_Info.class);
			typedQuery.setParameter("name", name);
			Products_Info product = typedQuery.getSingleResult();
			return product;
			}catch (Exception e) {
                e.printStackTrace();
                return null;
		}
	}
	
	

	@Override
	public List<Products_Info> getProductByCategory(String category) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Products_Info where category=:category";
		TypedQuery<Products_Info> typedquery = manager.createQuery(jpql,Products_Info.class);
		return typedquery.getResultList();
	}

	

	@Override
	public List<Products_Info> getProductByCompany(String company) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Products_Info where company=:company";
	    TypedQuery<Products_Info> typedquery = manager.createQuery(jpql,Products_Info.class);
	     return typedquery.getResultList();
	}
	
	

}
