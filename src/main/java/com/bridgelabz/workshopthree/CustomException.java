package com.bridgelabz.workshopthree;

public class CustomException extends Exception {
	String message;

	public static class InvalidUserNameException extends RuntimeException {
		public InvalidUserNameException(String message) {
			super(message);
		}
	}

}
