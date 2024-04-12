package maps;

public class Pays {
	private String name;
	private int population;
	private String continent;

	public Pays(String name, int population, String continent) {
		super();
		this.name = name;
		this.population = population;
		this.continent = continent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

}
