package fr.diginamic.banque.entities;

public class Credit extends Operation {
	
	public Credit(String date, double montant) {
		super(date, montant);
	}
	
	public String getType() {
		return "CREDIT";
	}



}
