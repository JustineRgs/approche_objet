package listes;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		List<Ville> listeVilles = new ArrayList<>();
		listeVilles.add(new Ville("New York", 8804190, Continent.getContinent("Amérique")));
		listeVilles.add(new Ville("Paris", 10856407, Continent.getContinent("Europe")));
		listeVilles.add(new Ville("Pékin", 21598290, Continent.getContinent("Asie")));
		listeVilles.add(new Ville("Moscou", 13104177, Continent.getContinent("Europe")));
		listeVilles.add(new Ville("Berlin", 3520031, Continent.getContinent("Europe")));
		listeVilles.add(new Ville("Sydney", 4823991, Continent.getContinent("Océanie")));
		listeVilles.add(new Ville("Sao Paulo", 12396372, Continent.getContinent("Amérique")));
		listeVilles.add(new Ville("Dakar", 3896564, Continent.getContinent("Afrique")));
		
		for (Ville ville : listeVilles) {
			System.out.println(ville);
		}

	}

}
