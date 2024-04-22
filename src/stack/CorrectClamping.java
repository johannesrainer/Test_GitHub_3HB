package stack;

import java.util.Stack;

public class CorrectClamping {

    public static boolean isValid(String input) {
        Stack<Character> bracketsStack = new Stack<>();

        for (char sign : input.toCharArray()) {
            if (sign == '(' || sign == '{' || sign == '[') {
                bracketsStack.push(sign);
            } else if (sign == ')' || sign == '}' || sign == ']') {
                if (bracketsStack.isEmpty()) {
                    return false;
                }

                char lastOpener = bracketsStack.pop();

                if (lastOpener == '(' && sign != ')') {
                    return false;
                } else if (lastOpener == '{' && sign != '}') {
                    return false;
                } else if (lastOpener == '[' && sign != ']') {
                    return false;
                }
            }
        }

        return bracketsStack.isEmpty();
    }

    public static void main(String[] args) {
        String ausdruck = "(a + b) * (c - d)";
        
        if(isValid(ausdruck) == true) {
        	System.out.println("Korrekte Klammerung!");
        } else {
        	System.out.println("Fehlerhafte Klammerung!");
        }
    }
}

