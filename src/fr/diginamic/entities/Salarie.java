package fr.diginamic.entities;

public class Salarie {
	private String nom;
	private String prenom;
	private double salaire;

	public Salarie(String nom, String prenom, double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Nom : " + nom + ", Prenom : " + prenom + ", Salaire : " + salaire;
	}

}
