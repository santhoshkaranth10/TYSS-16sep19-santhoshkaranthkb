package com.testyantra.phoneprojec;

import java.util.List;
import java.util.Scanner;

import com.testyantra.phoneproject.dao.ContactDAO;
import com.testyantra.phoneproject.dto.ContactBean;
import com.testyantra.phoneproject.util.ContactManager;

public class App {

	public static void main(String[] args) {

		System.out.println("press 1 to show all contacts");
		System.out.println("press 2 to search for contact");
		System.out.println("press 3 to operate on contact");

		Scanner scn = new Scanner(System.in);
		int ch = scn.nextInt();

		switch(ch) {
		case 1: ContactDAO dao = ContactManager.getContactDAO();
		List<ContactBean> result = dao.getAllContactData();

		for (ContactBean bean : result) {
			System.out.println("name is "+bean.getName());//retrieving can be any order and even setting the values can be in any order 
			System.out.println("number is "+bean.getName());
			System.out.println("group_name is "+bean.getGroupName());

		}
		break;



		case 2:ContactDAO impl = ContactManager.getContactDAO();
		int id = scn.nextInt();
		ContactBean bean = impl.searchContactData("name");
		if(bean!=null) {
			System.out.println("name is "+bean.getName());//retrieving can be any order and even setting the values can be in any order 
			System.out.println("number is "+bean.getName());
			System.out.println("salary is "+bean.getGroupName());

		}else {
			System.out.println("no data found");
		}
		break;


		case 3:
			//ContactDAO impl1 = ContactManager.getContactDAO();
			System.out.println("press 1 to add contact");
			System.out.println("press 2 to update contact");
			System.out.println("press 3 to delete contact");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			switch(n) {

			case 1:
				System.out.println("Enter a name");
				String name1=sc.next();

				System.out.println("enter a number");
				int number=sc.nextInt();

				System.out.println("enter a group");
				String group=sc.next();
				ContactBean bean2=new ContactBean();
				bean2.setName(name1);
				bean2.setNumber(number);
				bean2.setGroupName(group);
				ContactDAO impl1 = ContactManager.getContactDAO();
				int i=impl1.InsertContactData(bean2);
				System.out.println(i+"Row inserted");
				break;
			case 2:
				System.out.println("Enter a name");
				String names=sc.next();

				System.out.println("enter a number");
				int number1=sc.nextInt();

				System.out.println("enter a group");
				String group1=sc.next();
				ContactBean bean3=new ContactBean();
				bean3.setName(names);
				bean3.setNumber(number1);
				bean3.setGroupName(group1);
				ContactDAO impl2=ContactManager.getContactDAO();
				int co=impl2.UpdateContactData(bean3);
				System.out.println(co+"Row Updated");
				break;
			case 3:
				System.out.println("enter name to be deleted");
				Scanner scc=new Scanner(System.in);
				String deletename=scc.nextLine();
				ContactDAO impl4=ContactManager.getContactDAO();
				int count=impl4.DeleteContactData(deletename);
				System.out.println(count+" deleted");
				break;
			}

			break;

		}
	}
}




