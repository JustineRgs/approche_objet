package listes;

import java.util.ArrayList;
import java.util.List;

public class TestVilles {

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

		for (Ville ville : listeVilles) {
			System.out.println(ville);
		}
		System.out.println();

		Ville morePopulation = listeVilles.get(0);
		for (Ville ville : listeVilles) {
			if (ville.getPopulation() > morePopulation.getPopulation()) {
				morePopulation = ville;
			}
		}
		System.out.println("Ville avec le plus grand nombres d'habitants : " + morePopulation);
		System.out.println();

		Ville fewerPopulation = listeVilles.get(0);
		for (Ville ville : listeVilles) {
			if (ville.getPopulation() < fewerPopulation.getPopulation()) {
				fewerPopulation = ville;
			}
		}
		listeVilles.remove(fewerPopulation);

		System.out.println("Liste de villes après suppression de " + fewerPopulation.getName()
				+ ", ville ayant le moins d'habitants :");
		for (Ville ville : listeVilles) {
			System.out.println(ville);
		}
		System.out.println();

		for (Ville ville : listeVilles) {
			if (ville.getPopulation() > 100000) {
				ville.setName(ville.getName().toUpperCase());
			}
		}
		System.out.println(
				"Liste de villes après modification des noms en majuscules pour les populations de plus de 100000habitants :");
		for (Ville ville : listeVilles) {
			System.out.println(ville);
		}

	}

}
