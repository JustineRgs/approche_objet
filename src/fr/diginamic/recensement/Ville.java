package fr.diginamic.recensement;

public class Ville implements Comparable<Ville>{
	public int codeRegion, codeCommune, populationTotale;
	public String nomRegion, nomCommune, codeDepartement;
	
	public Ville(int codeRegion, String codeDepartement, int codeCommune, int populationTotale, String nomRegion, String nomCommune) {
		this.codeRegion = codeRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.populationTotale = populationTotale;
		this.nomRegion = nomRegion;
		this.nomCommune = nomCommune;
	}
	
	@Override
	public String toString() {
		return String.format("%d %s %d %d %s %s", codeRegion, codeDepartement, codeCommune, populationTotale, nomRegion, nomCommune)+ "\n";
	}
	
	public int compareTo(Ville ville) {
		return nomRegion.compareTo(ville.nomRegion);
	}
}

