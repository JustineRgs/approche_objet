package fr.diginamic.chaines;

import fr.diginamic.entities.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";

		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);

		int longueur = chaine.length();
		System.out.println("Longueur de la chaine: " + longueur);

		int index = chaine.indexOf(';');
		System.out.println("Index du premier ';' : " + index);

		String nomDeFamille = chaine.substring(0, index);
		System.out.println("Nom de famille : " + nomDeFamille);
		System.out.println("Nom de famille en majuscule : " + nomDeFamille.toUpperCase());
		System.out.println("Nom de famille en minuscule : " + nomDeFamille.toLowerCase());

		String[] morceaux = chaine.split(";");
		System.out.println("Morceaux de la chaîne :");
		for (String morceau : morceaux) {
			System.out.println(morceau);
		}

		String prenom = morceaux[1];
		System.out.println(prenom);

		String salaireString = morceaux[2].replace(" ", "");
		double salaire = Double.parseDouble(salaireString);
		System.out.println(salaire);
		
		Salarie salarie = new Salarie(nomDeFamille, prenom, salaire);
		System.out.println(salarie);
	}

}
