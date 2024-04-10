package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		Maison maison = new Maison(8);

		maison.ajouterPiece(new Cuisine(30, 0));
		maison.ajouterPiece(new Salon(30, 0));
		System.out.println("Superficie RDC : " + maison.superficieEtage(0));
		System.out.println();
		
		maison.ajouterPiece(new SalleDeBain(8, 1));
		maison.ajouterPiece(new Chambre(14, 1));
		maison.ajouterPiece(new Chambre(18, 1));
		maison.ajouterPiece(new WC(2, -1));
		System.out.println("Superficie étage 1 : " + maison.superficieEtage(1));
		System.out.println();
		
		System.out.println("Superficie totale de la maison : " + maison.superficieTotale());
		System.out.println();
		
		double superficieChambres = maison.superficieParPiece("Chambre");
		System.out.println("Superficie totale des chambres : " + superficieChambres);
		System.out.println();
		
		double nombresChambres = maison.nombresPieces("Chambre");
		System.out.println("Nombres de chambres : " + nombresChambres);
	}

}
