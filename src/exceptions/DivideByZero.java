package exceptions;

import java.lang.ArithmeticException;

public class DivideByZero {

	public static void divide(double x, double y) {
		if(y == 0) {
			throw new ArithmeticException("Division durch 0 ist nicht erlaubt");
		} else {
			double result = x/y;
			System.out.println(result);
		}
	}
	
	public static void main(String[] args) {
		try {
			divide(5,0);
		} catch (ArithmeticException e) {
				System.err.println("Fehler: " + e.getMessage());
		}
	}

}
