package entites;

public class Facture {
	private int consommation;
	private double prix;

	public void modifConso(int consommation) {
		this.consommation = consommation;
		this.prix = this.consommation * 0.15;
	}

	public int getConso() {
		return consommation;
	}

	public double getPrix() {
		return prix;
	}
}
