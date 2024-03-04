package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe_1_Kommentare_Filtern {

	public static void main(String[] args) {
		
		List<String> lines = new ArrayList<String>();
		lines.add("Magnetkompass");
		lines.add("Geschwindigkeit der Wasserströmung");
		lines.add("Wetter");
		lines.add("Kommentar und allgemeine Beobachtung");
		lines.add("Magnetkompass");
		lines.add("Geschwindigkeit der Wasserströmung");
		lines.add("Wetter");
		lines.add("Kommentar und allgemeine Beobachtung");
		lines.add("Magnetkompass");
		lines.add("Geschwindigkeit der Wasserströmung");
		lines.add("Wetter");
		lines.add("Kommentar und allgemeine Beobachtung");
		lines.add("Magnetkompass");
		lines.add("Geschwindigkeit der Wasserströmung");
		lines.add("Wetter");
		lines.add("Kommentar und allgemeine Beobachtung");
		
		
		reduceToComments(lines);
		System.out.println(lines);
		

	}
	
	public static void reduceToComments(List<String> lines) {
		int counter = 1;
		for(int i = 0; i < lines.size(); i++) {
			if(i != counter * 4) {
				lines.remove(i);
				counter++;
			}
		}
		
				
	}
}
