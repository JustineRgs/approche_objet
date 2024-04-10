package fr.diginamic.formes;

public class Rectangle extends Carre {
	private double largeur;

	public Rectangle(double longueur, double largeur) {
		super(longueur);
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {
		return getLongueur() * largeur;
	}

	@Override
	public double calculerPerimetre() {
		return 2 * (getLongueur() + largeur);
	}

}
