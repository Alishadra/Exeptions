package org.exceptionExample;

public class ExceptionExample {

	public static void main(String[] args) {

		Square square = new Square();
		
		
		try {
			System.out.println(1/0);
		} catch (ArithmeticException e) {
			
			System.err.println("Деление на 0 не возможно");
		} 
		
	}

}
