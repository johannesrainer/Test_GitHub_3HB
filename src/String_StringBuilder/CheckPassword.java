package String_StringBuilder;

import java.util.regex.Pattern;

public class CheckPassword {
	
	public static boolean isGoodPassword(String input) {
		Pattern characters = Pattern.compile("[a-zA-Z]");
		Pattern numbers = Pattern.compile("[\\d+]");
		Pattern specialSigns = Pattern.compile("[!#$%&'()*+,-./:;<=>?@\\]^_`{|}~]");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
