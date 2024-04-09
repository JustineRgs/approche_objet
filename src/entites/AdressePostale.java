package entites;

public class AdressePostale {
	String numeroRue;
	String libelleRue;
	String ville;
	int codePostal;

	AdressePostale(String numeroRue, String libelleRue, int codePostal, String ville) {
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;

	}

	public String toString() {
		return numeroRue + " " + libelleRue + ", " + codePostal + " " + ville;
	}
}
