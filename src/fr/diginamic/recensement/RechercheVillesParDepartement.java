package fr.diginamic.recensement;

import java.util.Collections;
import java.util.Scanner;

public class RechercheVillesParDepartement extends MenuService {

	public void traiter(Recensement recensement, Scanner scanner) {
		Collections.sort(recensement.villes, new ComparatorPopulation());

		int i = 10;
		String choice = scanner.next();

		System.out.println("10 villes les plus peuplées du département numéro " + choice + " : ");
		for (Ville ville : recensement.villes) {
			if (ville.codeDepartement.equals(choice) && i > 0) {
				System.out.println(ville.nomCommune + " - " + ville.populationTotale + " habitants.");
				i--;
			}
		}
	}

}
