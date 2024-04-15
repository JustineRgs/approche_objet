package fr.diginamic.recensement;

import java.util.Collections;
import java.util.Scanner;

public class VillesMaxPopulation {
	public void traiter(Recensement recensement, Scanner scanner) {
		Collections.sort(recensement.villes, new ComparatorPopulation());

		for (int i = 0; i < 10; i++) {
			System.out.println(recensement.villes.get(i).nomCommune + " - " + recensement.villes.get(i).populationTotale
					+ " habitants. ");
		}
	}
}
