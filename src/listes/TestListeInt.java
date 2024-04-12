package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {

	public static void main(String[] args) {
		ArrayList<Integer> listeEntiers = new ArrayList<>();
		listeEntiers.add(-1);
		listeEntiers.add(5);
		listeEntiers.add(7);
		listeEntiers.add(3);
		listeEntiers.add(-2);
		listeEntiers.add(4);
		listeEntiers.add(8);
		listeEntiers.add(5);

		System.out.println("Liste d'entiers : " + listeEntiers);
		System.out.println("Taille de la liste : " + listeEntiers.size());
		System.out.println("Plus grand élement de la liste : " + Collections.max(listeEntiers));

		listeEntiers.remove(Collections.min(listeEntiers));
		System.out.println("Liste d'entiers avec le plus petit supprimé: " + listeEntiers);

		for (int i = 0; i < listeEntiers.size(); i++) {
			int nombre = listeEntiers.get(i);
			if (nombre < 0) {
				listeEntiers.set(i, Math.abs(nombre));
			}
		}

		System.out.println("Liste avec élements negatifs transformés : " + listeEntiers);

	}

}
