package listes;

public class Ville {
	protected String name;
	protected double population;
	
	public Ville(String name, double population) {
		super();
		this.name = name;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return name + ", Population : " + population;
	}
	
}
