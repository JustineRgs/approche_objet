package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		Saison[] saisons = Saison.values();
		for (Saison saison : saisons) {
			System.out.println(saison);
		}
		
		String nom = "ETE";
		Saison saisonEte = Saison.valueOf(nom);
		System.out.println("Le libellé de la saison ETE est : " + saisonEte.label);

		String libelle = "Hiver";
		Saison saisonHiver = Saison.getSaison(libelle);
		System.out.println("La saison correspondant au libellé \"Hiver\" est : " + saisonHiver);
	}

}
