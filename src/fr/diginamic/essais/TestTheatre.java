package fr.diginamic.essais;

import fr.diginamic.entities.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre theatre1 = new Theatre("Theatre 'Montpellier'", 100, 14, 140);
		theatre1.inscrire(20, 10);
		theatre1.inscrire(48, 7);
		theatre1.inscrire(5, 5);
		theatre1.inscrire(13, 10);
		theatre1.inscrire(20, 10);
	}

}
