package fr.diginamic.formes;

public class Carre extends Forme {
	private double longueur;

	public Carre(double longueur) {
		super();
		this.longueur = longueur;
	}

	@Override
	public double calculerSurface() {
		return Math.pow(longueur, 2);
	}

	@Override
	public double calculerPerimetre() {
		return 4 * longueur;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	
	

}
