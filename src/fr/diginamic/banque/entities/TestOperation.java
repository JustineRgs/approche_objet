package fr.diginamic.banque.entities;

public class TestOperation {

	public static void main(String[] args) {
		Operation[] operations = new Operation[4];
		operations[0] = new Credit("08/04/2024", 1500);
		operations[1] = new Debit("08/04/2024", 553);
		operations[2] = new Debit("08/04/2024", 23);
		operations[3] = new Credit("08/04/2024", 1000);

		double somme = 0.0;
		for (int i = 0; i < operations.length; i++) {
			System.out.println(operations[i]);
			if (operations[i].getType().equals("CREDIT")) {
				somme += operations[i].getMontant();
			} else {
				somme -= operations[i].getMontant();
			}
			System.out.println("Montant total : " + somme);
		}

	}

}
