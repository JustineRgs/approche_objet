package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	private int joursTravailles;
	private double tauxJournalier;

	public Pigiste(String nom, String prenom, int joursTravailles, double tauxJournalier) {
		super(nom, prenom);
		this.joursTravailles = joursTravailles;
		this.tauxJournalier = tauxJournalier;
	}

	@Override
	public double getSalaire() {
		return joursTravailles * tauxJournalier;
	}

	@Override
	public String getStatut() {
		return "Pigiste";
	}

}
