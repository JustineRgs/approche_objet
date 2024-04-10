package fr.diginamic.entities;

public class TestCercle {

	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(3);
		System.out.println("Perimètre du cercle1 : " + cercle1.calcPerimetre());
		System.out.println("Surface du cercle1 : " + cercle1.caclSurface());

		Cercle cercle2 = new Cercle(5);
		System.out.println("Perimètre du cercle2 : " + cercle2.calcPerimetre());
		System.out.println("Surface du cercle2 : " + cercle2.caclSurface());
	}
}
