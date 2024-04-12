package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TriVilles {

	public static void main(String[] args) {
		List<Ville> listeVilles = new ArrayList<>();

		listeVilles.add(new Ville("Nice", 343000));
		listeVilles.add(new Ville("Carcassonne", 47800));
		listeVilles.add(new Ville("Narbonne", 53400));
		listeVilles.add(new Ville("Lyon", 484000));
		listeVilles.add(new Ville("Foix", 9700));
		listeVilles.add(new Ville("Pau", 77200));
		listeVilles.add(new Ville("Marseille", 850700));
		listeVilles.add(new Ville("Tarbes", 40600));

		Collections.sort(listeVilles);
		for (Ville ville : listeVilles) {
			System.out.println(ville);
		}

	}
}
