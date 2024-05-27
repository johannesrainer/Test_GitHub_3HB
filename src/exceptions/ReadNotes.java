package exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadNotes {
	
	private static final Pattern notes = Pattern.compile("C,?|D,?|E,?|F,?|G,?|A,?|B,?|c'?|d'?|e'?|f'?|g'?|a'?|b'?|");

	public static void main (String[] args) {
		String fileName = "file.txt";
		
		try {
			Scanner sc = new Scanner(Paths.get(fileName));
			PrintWriter printWriter = new PrintWriter(new FileOutputStream("finalNotes.txt"));
			printWriter.println("M:C");
			printWriter.println("L:1/4");
			printWriter.println("K:C");
			while (sc.hasNextLine()) {
				String note = sc.nextLine();
				if(notes.matcher(note).matches()) {
					printWriter.print(note + " ");
				}
			}
			sc.close();
			printWriter.close();
		} catch (FileNotFoundException e) {
			System.err.print("Datei wurde nicht gefunden: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Datei konnte nicht geöffnet werden: " + e.getMessage());
		}
		
		
	}
	
	
}
