package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		double calc1 = Operations.calcul(1, 2, '+');
		System.out.println("Addition : " + calc1);

		double calc2 = Operations.calcul(1, 2, '-');
		System.out.println("Soustraction : " + calc2);

		double calc3 = Operations.calcul(1, 2, '*');
		System.out.println("Multiplication : " + calc3);

		double calc4 = Operations.calcul(1, 2, '/');
		System.out.println("Division : " + calc4);
	}
}
