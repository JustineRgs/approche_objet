package fr.diginamic.recensement;

public class Departement implements Comparable<Departement> {
	String codeDepartement;
	int populationTotale;

	public Departement(String codeDepartement, int populationTotale) {
		this.codeDepartement = codeDepartement;
		this.populationTotale = populationTotale;
	}

	public String toString() {
		return String.format("%s %d", codeDepartement, populationTotale) + "\n";
	}

	public int compareTo(Departement departement) {
		if (populationTotale < departement.populationTotale) {
			return 1;
		} else if (populationTotale > departement.populationTotale) {
			return -1;
		} else {
			return 0;
		}
	}
}