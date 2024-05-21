package exceptions;

import java.util.Arrays;

public class StringArrayParser {
	
	private static int parseStringToInt(String number, int defaultValue) {
		try {
			return Integer.parseInt(number);
		} catch(NumberFormatException e) {
			return defaultValue;
		}
	}

	public static int[] parseInts(String... numbers) {
		int[] intNumbers = new int[numbers.length];
		for(int i = 0; i < numbers.length; i++) {
			intNumbers[i] = parseStringToInt(numbers[i], 0);
		}
		return intNumbers;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test1 = parseInts("12", "123", "1234", "12345");
		System.out.println(Arrays.toString(test1));
		int[] test2 = parseInts("12", "abc", "123");
		System.out.println(Arrays.toString(test2));
	}

}
