package listes;

public enum Continent {
	AFRIQUE("Afrique"), 
	AMERIQUE("Amérique"),
	ASIE("Asie"), 
	EUROPE("Europe"),
	OCEANIE("Océanie");
	
	String label;
	
	private Continent(String label) {
		this.label = label;
	}
	
	public static Continent getContinent(String label) {
		for (Continent continent : Continent.values()) {
			if (continent.label.equals(label)) {
				return continent;
			}
		}
		return null;
	}
}
