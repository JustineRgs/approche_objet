package fr.diginamic.banque.entities;

public class Compte {
	private String numeroCompte;
	private double solde;

	Compte(String numeroCompte, double solde) {
		super();
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Numéro de compte : " + numeroCompte + ", Solde du compte : " + solde;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

}
