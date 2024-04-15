package fr.diginamic.recensement;

import java.util.Collections;
import java.util.Scanner;

public class RechercheVillesParRegion extends MenuService {
	
	public void traiter(Recensement recensement, Scanner scanner) {
		Collections.sort(recensement.villes, new ComparatorPopulation());
		int i = 10;
		int choice = scanner.nextInt();

		System.out.println("10 villes les plus peuplées de la région numéro " + choice + " : ");
		for (Ville ville : recensement.villes) {
			if ((ville.codeRegion == choice) && i > 0) {
				System.out.println(ville.nomCommune + " - " + ville.populationTotale + " habitants.");
				i--;
			} 
		}
	}
}
