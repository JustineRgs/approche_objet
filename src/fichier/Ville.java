package fichier;

public class Ville {
	private String name;
	private String numDepartment;
	private String nameRegion;
	private int totalPopulation;

	public Ville(String name, String numDepartment, String nameRegion, int totalPopulation) {
		super();
		this.name = name;
		this.numDepartment = numDepartment;
		this.nameRegion = nameRegion;
		this.totalPopulation = totalPopulation;
	}

	@Override
	public String toString() {
		return "Nom : '" + name + '\'' + ", Code département : '" + numDepartment + '\'' + ", Nom région : '"
				+ nameRegion + '\'' + ", Populaion totale : " + totalPopulation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameRegion() {
		return nameRegion;
	}

	public void setNameRegion(String nameRegion) {
		this.nameRegion = nameRegion;
	}

	public String getNumDepartment() {
		return numDepartment;
	}

	public void setNumDepartment(String numDepartment) {
		this.numDepartment = numDepartment;
	}

	public int getTotalPopulation() {
		return totalPopulation;
	}

	public void setTotalPopulation(int totalPopulation) {
		this.totalPopulation = totalPopulation;
	}

}
