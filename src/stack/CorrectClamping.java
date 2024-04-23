package stack;

import java.util.LinkedList;


public class CorrectClamping {

    public static boolean isValid(String input) {
        LinkedList<Character> stack = new LinkedList<>();

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char lastOpener = stack.peek();

                if ((lastOpener == '(' && c != ')') ||
                		(lastOpener == '{' && c != '}') ||
                		(lastOpener == '[' && c != ']')) {
                    return false;
                }
            	stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String ausdruck = "(a + b) * (c - d)";
        //	String ausdruck2 = "([{]})";
        
        if(isValid(ausdruck) == true) {
        	System.out.println("Korrekte Klammerung!");
        } else {
        	System.out.println("Fehlerhafte Klammerung!");
        }
        
    }
}

