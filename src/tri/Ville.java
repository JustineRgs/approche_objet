package tri;

public class Ville implements Comparable<tri.Ville> {
	protected String name;
	protected int population;
	
	public Ville(String name, int population) {
		super();
		this.name = name;
		this.population = population;
	}

	@Override
	public int compareTo(Ville o) {
		if (this.population > o.getPopulation()) {
			return 1;
		} else if (this.population < o.getPopulation()) {
			return -1;
		} else {
			return 0;
		}
		
		//Ordre alphabétique : 
		//return this.name.compareTo(o.getName());
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

	@Override
	public String toString() {
		return name + ", Population : " + population;
	}

}
