package tri;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville>{
	public int compare(Ville ville, Ville ville2) {
		return ville.name.compareTo(ville2.name);
	}
}