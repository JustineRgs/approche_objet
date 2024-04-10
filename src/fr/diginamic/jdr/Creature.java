package fr.diginamic.jdr;

import java.util.Random;

public class Creature {
	String nom;
	int force;
	int vie;

	public Creature(String nom, int forceMin, int forceMax, int vieMin, int vieMax) {
		this.nom = nom;
		this.force = new Random().nextInt(forceMax - forceMin + 1) + forceMin;
		this.vie = new Random().nextInt(vieMax - vieMin + 1) + vieMin;
	}
}
