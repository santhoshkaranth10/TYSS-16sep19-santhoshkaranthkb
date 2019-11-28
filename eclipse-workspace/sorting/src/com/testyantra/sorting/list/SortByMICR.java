package com.testyantra.sorting.list;

import java.util.Comparator;

public class SortByMICR implements Comparator<Bank> {

	@Override
	public int compare(Bank o1, Bank o2) {
		
	 Long i =o1.MICR;
	 Long j = o2.MICR;
	 return i.compareTo(j);
	}
	
	
	

	
}
