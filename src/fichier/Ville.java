package fichier;

public class Ville implements Comparable<Ville> {
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
	public int compareTo(Ville other) {
		// Population ordre croissant / décroissant (inversement 1/-1)
		if (other.getTotalPopulation() < this.totalPopulation) {
			return -1;
		} else if (other.getTotalPopulation() > this.totalPopulation) {
			return 1;
		}
		return 0;

		// Ordre alphabétique
		// return this.name.compareTo(other.getName());
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
