package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
	public static void main(String[] args) {
		CalculMoyenne calc1 = new CalculMoyenne();
		calc1.add(12);
		calc1.add(18.5);
		calc1.add(16.75);
		System.out.println("Moyenne calc1 : " + calc1.calc());
		
		CalculMoyenne calc2 = new CalculMoyenne();
		calc2.add(15);
		calc2.add(10);
		System.out.println("Moyenne calc2 : " + calc2.calc());
	}
}