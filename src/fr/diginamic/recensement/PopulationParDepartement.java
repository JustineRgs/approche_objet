package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PopulationParDepartement extends MenuService {
	List<Departement> departements = new ArrayList<Departement>();

	public void traiter(Recensement recensement, Scanner scanner) {
		boolean found = false;
		int populationTotale = 0;

		for (int i = 0; i < recensement.villes.size(); i++) {
			if (found == true) {
				if (recensement.villes.get(i).codeDepartement
						.equals(recensement.villes.get(i - 1).codeDepartement)
						&& (i != (recensement.villes.size() - 1))) {
					populationTotale += recensement.villes.get(i).populationTotale;
				} else {
					departements.add(new Departement(recensement.villes.get(i - 1).codeDepartement, populationTotale));
					populationTotale = recensement.villes.get(i).populationTotale;
				}
			} else {
				found = true;
				populationTotale = recensement.villes.get(i).populationTotale;
			}
		}

		String n = scanner.next();

		for (Departement departement : departements) {
			if (departement.codeDepartement.equals(n)) {
				System.out.println("Département recherchée : " + departement.codeDepartement + ". Population totale : "
						+ departement.populationTotale);
				return;
			} 	

		}
	}
}
