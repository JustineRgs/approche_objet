package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RechercheDixRegionsPlusPeuplees extends MenuService {
	List<Region> regions = new ArrayList<Region>();
	List<Ville> sortedByRegion = new ArrayList<Ville>();

	public void traiter(Recensement recensement, Scanner scanner) {
		sortedByRegion = recensement.villes;
		boolean found = false;
		int populationTotale = 0;

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

		Collections.sort(regions);
		System.out.println("10 régions les plus peuplées : ");
		for (int i = 0; i < 10; i++) {
			System.out.println(regions.get(i).nomRegion + " - " + regions.get(i).populationTotale + " habitants.");
		}
	}
}