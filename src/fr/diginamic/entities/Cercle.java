package fr.diginamic.entities;

public class Cercle {
	private double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	public double calcPerimetre() {
		return 2 * Math.PI * rayon;
	}

	public double caclSurface() {
		return Math.PI * rayon * rayon;
	}
}
