package cts;

public class InvalidAgeException extends Exception{

	public InvalidAgeException() {
		// TODO Auto-generated constructor stub
		   super("Age cannot be negative or more than 100");
	}

}
