package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorPopulation implements Comparator<Ville> {
	public int compare(Ville ville, Ville ville2) {
		if (ville.populationTotale < ville2.populationTotale) {
			return 1;
		} else if (ville.populationTotale > ville2.populationTotale) {
			return -1;
		} else {
			return 0;
		}
	}
}
