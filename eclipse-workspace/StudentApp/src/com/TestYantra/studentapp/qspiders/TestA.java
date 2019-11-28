package com.TestYantra.studentapp.qspiders;

//import com.TestYantra.studentapp.jspiders.Angular;
//import com.TestYantra.studentapp.jspiders.React;

import com.TestYantra.studentapp.jspiders.*;

public class TestA {
	
    public static void main(String[] args) {
    	QTP q = new QTP();
    	q.teachQTP();
    	
	    Selenium se = new Selenium();
	    se.teachSelenium();
	    
//	  com.TestYantra.studentapp.jspiders.Angular a = new com.TestYantra.studentapp.jspiders.Angular();
//
//	  com.TestYantra.studentapp.jspiders.React r = new com.TestYantra.studentapp.jspiders.React();

	    Angular a = new Angular();
	    a.teachAngular();
	    
	    React r = new React();
	    r.teachReact();
	}
}
