package listes;

import java.util.Objects;

public class Ville {
	protected String name;
	protected double population;
	Continent continent;

	public Ville(String name, double population, Continent continent) {
		super();
		this.name = name;
		this.population = population;
		this.continent = continent;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Ville other = (Ville) obj;
		return Objects.equals(this.name, other.name) && this.population == other.population;
	}

	@Override
	public String toString() {
		return name + ", Population : " + population + ", Continent : " + continent;
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

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

}
