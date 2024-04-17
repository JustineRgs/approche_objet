package fr.diginamic.recensement;

import java.util.Scanner;

public class PopulationParVille extends MenuService {
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		int choice = scanner.nextInt();

		for (Ville ville : recensement.villes) {
			if (ville.codeCommune == choice) {
				System.out.println("Ville recherchée : " + ville.nomCommune + ". Population totale : "
						+ ville.populationTotale + " habitants.");
				break;
			}
		}
	}
}
