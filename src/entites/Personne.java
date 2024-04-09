package entites;

public class Personne {
	String nom;
	String prenom;
	AdressePostale adresse;
	
	Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;

	}

	public String toString() {
		return nom + " " + prenom + ", " + adresse ;
	}
}
