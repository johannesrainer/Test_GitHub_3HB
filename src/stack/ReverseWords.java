package stack;

import java.util.Stack;

public class ReverseWords {
	
public static String reverseString(String input) {
		
		Stack<Character> stack = new Stack<>();
		
			for (int i = 0; i < input.length(); i++) {
	            stack.push(input.charAt(i));
	        }
			
			StringBuilder reversedString = new StringBuilder();
			
			while (!stack.isEmpty()) {
	            reversedString.append(stack.pop());
	        }
			 return reversedString.toString();	
    }
	
	public static void main(String[] args) {
		
        String input1 = "Hello";
        String input2 = "12345";
        String input3 = "racecar";
        System.out.println("Original String: " + input1);
        System.out.println("Reversed String: " + reverseString(input1));
        System.out.println("Original String: " + input2);
        System.out.println("Reversed String: " + reverseString(input2));
        System.out.println("Original String: " + input3);
        System.out.println("Reversed String: " + reverseString(input3));
        
    }
}


