package fr.diginamic.banque.entities;

public class TestBanque {

	public static void main(String[] args) {
		Compte utilisateur = new Compte("FR73736648", 1500.34);

		System.out.println(utilisateur);

		Compte[] comptes = new Compte[2];

		comptes[0] = new Compte("C1001", 1500.0);

		comptes[1] = new CompteTaux("C2001", 2500.0, 0.03);

		for (Compte compte : comptes) {
			System.out.println(compte.toString());
		}
	}

}
