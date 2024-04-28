
package String_StringBuilder;
 
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class CheckPassword {
 
	public static boolean isGoodPassword(String password) {
		Pattern capitalLetters = Pattern.compile(".*[A-Z].*");
		Pattern numbers = Pattern.compile("\\d+");
		Pattern special = Pattern.compile("[!§$%?#*]");
		// Statt drei Variablen -> Array
		boolean [] isSafe = new boolean[3];
		// Ein gutes Passwort enthält:
		// min. 8 Buchstaben,
		if (password.length() < 8) {
			return false;
		}
		// ...davon min. 1 Großbuchstabe
		// Zahlen und Sonderzeichen
		for (String s : password.split("")) {
			Matcher cLMatcher = capitalLetters.matcher(s);
			Matcher numberMatcher = numbers.matcher(s);
			Matcher specialMatcher = special.matcher(s);
			if (cLMatcher.matches()) {
				isSafe[0] = true;
			} else if (numberMatcher.matches()) {
				isSafe[1] = true;
			} else if (specialMatcher.matches()) {
				isSafe[2] = true;
			}
		}
		if (isSafe[0] && isSafe[1] && isSafe[2]) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isGoodPassword("IstDiesGut2?!"));
		System.out.println(isGoodPassword("UndDasHier"));
		System.out.println(isGoodPassword("WasHälstDuVonDem123#"));
	}
 
}