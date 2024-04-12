package tri;

import java.util.Comparator;

import fichier.Ville;

public class ComparatorHabitant implements Comparator<Ville> {

	@Override
	public int compare(Ville o1, Ville o2) {
		if (o1.getTotalPopulation() < o2.getTotalPopulation()) {
			return -1;
		} else if (o1.getTotalPopulation() > o2.getTotalPopulation()) {
			return 1;
		}
		return 0;
	}
	
	public int ComparatorNom(Ville o1, Ville o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
