package exceptions;




public class CheckFilenameExtension {
	
	public static int CheckFileExtension(String filename) throws Exception {
		int points = 0;
		if(filename.endsWith(".java")) {
			points += 1;
			System.out.println(points);
		} else if(!(filename.endsWith(".java")) && !filename.isEmpty()) {
			points = 0;
			System.out.println(points);
		} else if(filename.isEmpty() || filename.isBlank()) {
			points -= 1;
			System.out.println(points);
			throw new Exception("Der Dateiname ist entweder null oder ein leerer String: -1 Punkt");
			
		}
		return points;
		
	}

	public static void main(String[] args) {
		try {
			CheckFileExtension(".java"); 
			} catch (Exception e) {
				System.err.println("Fehler: " + e.getMessage());
			}
		

	}

}
