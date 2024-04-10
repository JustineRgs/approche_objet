package fr.diginamic.salaire;

public abstract class Intervenant {
	protected String nom;
	protected String prenom;

	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public abstract double getSalaire();

	public abstract String getStatut();

	public void afficherDonnees() {
		System.out.println("Nom: " + nom);
		System.out.println("Prénom: " + prenom);
		System.out.println("Salaire: " + getSalaire());
		System.out.println("Statut: " + getStatut());
	}

}
