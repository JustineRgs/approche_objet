package fr.diginamic.banque.entities;

public class Debit extends Operation {

	public Debit(String date, double montant) {
		super(date, montant);
	}
	
	public String getType() {
		return "DEBIT";
	}

}
