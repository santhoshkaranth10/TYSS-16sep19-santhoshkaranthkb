package com.testyantra.phoneproject.util;

import com.testyantra.phoneproject.dao.ContactDAO;
import com.testyantra.phoneproject.dao.ContactDAOImpl;

public class ContactManager {

  public static ContactDAO getContactDAO() {
		return new ContactDAOImpl();
}
}
