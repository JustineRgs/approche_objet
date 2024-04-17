package fr.diginamic.testenumeration;

public enum Saison {
	PRINTEMPS(1, "Printemps"),
	ETE(2, "Eté"),
	AUTOMNE(3, "Automne"),
	HIVER(4, "Hiver");
	
	int order;
	String label;
	
	private Saison(int order, String label) {
		this.order = order;
		this.label = label;
	}
	
	public static Saison getSaison(String label) {
		for (Saison saison : Saison.values()) {
			if (saison.label.equals(label)) {
				return saison;
			}
		}
		return null;
	}
}
