package com.example.parking.exception;

public class UserNotFoundByNameException extends RuntimeException {
	
	private String message;
	
	public UserNotFoundByNameException(String message) {
		this.message=message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
