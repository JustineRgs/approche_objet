package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		Cercle cercle = new Cercle(3);
		Carre carre = new Carre(8);
		Rectangle rectangle = new Rectangle(8, 12);

		AffichageForme affichageForme = new AffichageForme();

		System.out.println("Cercle : ");
		affichageForme.afficher(cercle);
		System.out.println();

		System.out.println("Carre : ");
		affichageForme.afficher(carre);
		System.out.println();

		System.out.println("Rectangle : ");
		affichageForme.afficher(rectangle);
	}
}
