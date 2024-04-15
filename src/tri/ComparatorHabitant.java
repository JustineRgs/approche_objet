package tri;

import java.util.Comparator;

import fichier.Ville;

public class ComparatorHabitant implements Comparator<tri.Ville> {
	private int choice;

	public ComparatorHabitant(int choice) {
		super();
		this.choice = choice;
	}

	@Override
	public int compare(tri.Ville o1, tri.Ville o2) {
		if (choice == 0) {
			return o1.getPopulation() - o2.getPopulation();
		} else if (choice == 1) {
			return o1.getName().compareTo(o2.getName());
		}
		return 0;

	}

}
