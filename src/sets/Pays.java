package sets;

import java.util.Arrays;
import java.util.HashSet;

public class Pays {
	String nom;
	int nbHabitant;
	double pibHabitant;

	public Pays(String nom, int nbHabitant, double pibHabitant) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.pibHabitant = pibHabitant;
	}

	public static void main(String[] args) {
		HashSet<Pays> hashSet = new HashSet<Pays>(Arrays.asList(new Pays("Usa", 12000, 50.5),
				new Pays("France", 70000000, 50000), new Pays("Allemagne", 5000, 100), new Pays("Uk", 500, 100),
				new Pays("Italie", 50000, 500), new Pays("Japon", 100000, 700), new Pays("Chine", 40000, 800),
				new Pays("Russie", 400000, 900), new Pays("Inde", 70000, 50)));

		double max = 0;
		String paysMaxPib = "";
		for (Pays pays : hashSet) {
			if (max < pays.pibHabitant) {
				max = pays.pibHabitant;
				paysMaxPib = pays.nom;
			}
		}
		System.out.println("Pays ayant le PIB/habitant le plus important : " + paysMaxPib);
		System.out.println();

		double maxTotal = 0;
		String paysMaxPibTotal = "";
		for (Pays pays : hashSet) {
			if ((pays.nbHabitant * pays.pibHabitant) > maxTotal) {
				maxTotal = (pays.nbHabitant * pays.pibHabitant);
				paysMaxPibTotal = pays.nom;
			}
		}
		System.out.println("Pays avec le PIB total le plus important : " + paysMaxPibTotal);
		System.out.println();

		double minTotal = Double.MAX_VALUE;
		Pays paysMinObject = null;
		for (Pays pays : hashSet) {
			if ((pays.nbHabitant * pays.pibHabitant) < minTotal) {
				minTotal = (pays.nbHabitant * pays.pibHabitant);
				paysMinObject = pays;
			}
		}
		paysMinObject.nom = paysMinObject.nom.toUpperCase();
		System.out.println("HashSet avec en majuscule le pays qui a le PIB total plus petit :");
		System.out.println(hashSet);
		System.out.println();

		hashSet.remove(paysMinObject);
		System.out.println("Ensemble des pays ainsi modifiés avec leur nom, nombre d’habitants et PIB total : ");
		System.out.println(hashSet);
	}

	public String toString() {
		return String.format("%s %d %f", nom, nbHabitant, pibHabitant);
	}

}