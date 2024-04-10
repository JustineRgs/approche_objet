package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		Salarie salarie = new Salarie("Ragues", "Justine", 1500);
		System.out.println("Salaire : " + salarie.getSalaire());
		salarie.afficherDonnees();
		System.out.println();

		Pigiste pigiste = new Pigiste("Durant", "Marcel", 3, 13.24);
		System.out.println("Salaire : " + pigiste.getSalaire());
		pigiste.afficherDonnees();
		System.out.println();

	}

}
