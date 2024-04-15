package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PopulationParRegion extends MenuService {
	List<Region> regions = new ArrayList<Region>();
	List<Ville> sortedByRegion = new ArrayList<Ville>();

	public void traiter(Recensement recensement, Scanner scanner) {
		boolean found = false;
		int populationTotale = 0;
		sortedByRegion = recensement.villes;
		Collections.sort(sortedByRegion);

		for (int i = 0; i < sortedByRegion.size(); i++) {
			if (found == true) {
				if (sortedByRegion.get(i).codeRegion == sortedByRegion.get(i - 1).codeRegion
						&& (i != (sortedByRegion.size() - 1))) {
					populationTotale += sortedByRegion.get(i).populationTotale;
				} else {
					regions.add(new Region(recensement.villes.get(i - 1).nomRegion,
							recensement.villes.get(i - 1).codeRegion, populationTotale));
					populationTotale = sortedByRegion.get(i).populationTotale;
				}
			} else {
				found = true;
				populationTotale = sortedByRegion.get(i).populationTotale;
			}
		}

		int choice = scanner.nextInt();

		for (Region region : regions) {
			if (region.codeRegion == choice) {
				System.out.println("Région recherchée : " + region.nomRegion + ". Population totale : "
						+ region.populationTotale + " habitants.");
			} else {
				System.out.println("Région non trouvée.");
				return;
			}
		}
	}
}
