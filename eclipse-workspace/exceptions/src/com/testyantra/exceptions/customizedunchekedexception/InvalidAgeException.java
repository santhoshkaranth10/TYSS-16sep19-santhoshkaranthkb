package com.testyantra.exceptions.customizedunchekedexception;

public class InvalidAgeException extends RuntimeException {

	String message = "Invalid age below 18 years not allowed";
	
	public InvalidAgeException() {
		
	}
	
	public InvalidAgeException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {//even we can override to-string also we will get the same result
		return getMessage();
	}
}
	
//	@Override
//	public String getMessage() {
//		return message;
//	}
//}
