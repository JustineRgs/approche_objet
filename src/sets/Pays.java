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
		HashSet<Pays> hashSet = new HashSet<Pays>(Arrays.asList(new Pays("Usa", 336997624, 59495),
				new Pays("France", 64531444, 43551), new Pays("Allemagne", 83408554, 50206), new Pays("Uk", 67281039	, 43620),
				new Pays("Italie", 59240329, 37970), new Pays("Japon", 124612530	, 42659), new Pays("Chine", 1425893465, 16624),
				new Pays("Russie", 145102755, 28712), new Pays("Inde", 1407563842, 5174)));

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