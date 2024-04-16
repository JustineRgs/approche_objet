package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {
	public int compare(Ville ville, Ville ville2) {
		if (ville2.population < ville.population) {
			return -1;
		} else if (ville2.population > ville.population) {
			return 1;
		} else {
			return 0;
		}
	}
}
