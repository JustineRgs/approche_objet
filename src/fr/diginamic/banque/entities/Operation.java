package fr.diginamic.banque.entities;

public abstract class Operation {
	private String date;
	private double montant;
	
	public Operation(String date, double montant) {
		super();
		this.date = date;
		this.montant = montant;
	}

	@Override
	public String toString() {
		return "Type d'opération : " + getType() + "; Date : " + date + "; Montant : " + montant + "]";
	}
	
	public abstract String getType();

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	
	
}
