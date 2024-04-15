package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RechercheDixDepartementsPlusPeuples extends MenuService {
	List<Departement> departement = new ArrayList<Departement>();

	public void traiter(Recensement recensement, Scanner scanner) {
		boolean found = false;
		int populationTotale = 0;

		for (int i = 0; i < recensement.villes.size(); i++) {
			if (found == true) {
				if (recensement.villes.get(i).codeDepartement.equals(recensement.villes.get(i - 1).codeDepartement)
						&& (i != (recensement.villes.size() - 1))) {
					populationTotale += recensement.villes.get(i).populationTotale;
				} else {
					departement.add(new Departement(recensement.villes.get(i - 1).codeDepartement, populationTotale));
					populationTotale = recensement.villes.get(i).populationTotale;
				}
			} else {
				found = true;
				populationTotale = recensement.villes.get(i).populationTotale;
			}
		}

		Collections.sort(departement);
		System.out.println("10 département les plus peuplées : ");
		for (int i = 0; i < 10; i++) {
			System.out.println("Département numéro : " + departement.get(i).codeDepartement + " - "
					+ departement.get(i).populationTotale + " habitants.");
		}
	}
}