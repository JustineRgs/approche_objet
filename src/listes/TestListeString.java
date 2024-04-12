package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeString {
	public static void main(String[] args) {
		List<String> listString = new ArrayList<String>();
		listString.add("Nice");
		listString.add("Carcassonne");
		listString.add("Narbonne");
		listString.add("Lyon");
		listString.add("Foix");
		listString.add("Pau");
		listString.add("Marseille");
		listString.add("Tarbes");

		System.out.println("Liste de villes : " + listString);
		System.out.println();

		String moreLetters = "";
		for (String string : listString) {
			if (string.length() > moreLetters.length()) {
				moreLetters = string;
			}
		}
		System.out.println("String ayant le plus de lettres : " + moreLetters);
		System.out.println();

		for (int i = 0; i < listString.size(); i++) {
			String string = listString.get(i);
			listString.set(i, string.toUpperCase());
		}

		System.out.println("Liste des villes en majuscule : " + listString);

		for (int i = 0; i < listString.size(); i++) {
			String string = listString.get(i);
			char firstLetter = Character.toUpperCase(string.charAt(0));
			if (firstLetter == 'N') {
				listString.remove(string);
			}
		}

		System.out.println("Liste des villes sans celle qui commence par N : " + listString);
	}
}
