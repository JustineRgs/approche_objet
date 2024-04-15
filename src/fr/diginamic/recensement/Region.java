package fr.diginamic.recensement;

public class Region implements Comparable<Region>{
	String nomRegion;
	int codeRegion, populationTotale;
	
	public Region(String nomRegion, int codeRegion, int populationTotale) {
		this.nomRegion = nomRegion;
		this.codeRegion = codeRegion;
		this.populationTotale = populationTotale;
	}

	public int compareTo(Region region) {
		if (populationTotale < region.populationTotale) {
			return 1;
		} else if (populationTotale > region.populationTotale) {
			return -1;
		} else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return String.format("%s %d %d", nomRegion, populationTotale)+ "\n";
	}

}
