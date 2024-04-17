package fr.diginamic.jdr;

import java.util.Random;
import java.util.Scanner;

public class Personnage {
	int force;
	int vie;
	int score = 0;

	public Personnage() {
		this.force = new Random().nextInt(7) + 12;
		this.vie = new Random().nextInt(31) + 20;
		this.score = 0;
	}

	public void Combat(Creature creature) {
		System.out.println("Combat contre " + creature.nom);

		while (this.vie > 0 && creature.vie > 0) {
			int attaquePersonnage = this.force + new Random().nextInt(10) + 1;
			int attaqueCreature = creature.force + new Random().nextInt(10) + 1;

			if (attaquePersonnage > attaqueCreature) {
				int degat = attaquePersonnage - attaqueCreature;
				int majVie = creature.vie - degat;
				creature.vie = majVie;
				System.out.println("Vous avez infligé " + degat + " à la créature adverse. Il vous reste " + this.vie
						+ " point de vie.");
			} else if (attaquePersonnage < attaqueCreature) {
				int degat = attaqueCreature - attaquePersonnage;
				int majVie = this.vie - degat;
				this.vie = majVie;
				System.out.println("La créature vous à infligé " + degat);
			} else {
				System.out.println("Personne ne prend de dégat. Il vous reste " + this.vie + " point de vie.");
			}
		}

		if (this.vie <= 0) {
			System.out.println("Votre personnage est décédé. Il a obtenu le score de " + this.score
					+ " points. Veuillez créer un nouveau personnage");
		} else {
			this.score += scoreCreature(creature);
			System.out.println("Gagné! Votre score est maintenant de " + this.score + " points.");
		}
	}

	public int scoreCreature(Creature creature) {
		if (creature.nom.equals("loup")) {
			return 1;
		} else if (creature.nom.equals("gobelin")) {
			return 2;
		} else if (creature.nom.equals("troll")) {
			return 5;
		} else {
			return 0;
		}
	}

	public void afficherScore() {
		System.out.println("Score actuel : " + this.score + " points.");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Personnage personnage = new Personnage();
		while (true) {
			System.out.println("MENU");
			System.out.println("1. Créer un personnage");
			System.out.println("2. Combattre une créature");
			System.out.println("3. Votre score");
			System.out.println("4. Sortir");
			int choix = scanner.nextInt();

			switch (choix) {
			case 1:
				personnage = new Personnage();
				System.out.println("Personnage créé !");
				System.out.println("Force du personnage : " + personnage.force);
				System.out.println("Vie du personnage : " + personnage.vie);
				break;
			case 2:
				if (personnage.vie > 0) {
					Creature creature = choisirCreature();
					personnage.Combat(creature);
				} else {
					System.out.println("Votre personnage est décédé. Veuillez créer un nouveau personnage.");
				}
				break;
			case 3:
				personnage.afficherScore();
				break;
			default:
				System.out.println("Merci d'avoir jouée!");
			}
			scanner.close();
		}
	}

	public static Creature choisirCreature() {
		Random random = new Random();
		int choixCreature = random.nextInt(3);
		switch (choixCreature) {
		case 0:
			return new Creature("loup", 3, 8, 5, 10);
		case 1:
			return new Creature("gobelin", 5, 10, 10, 15);
		case 2:
			return new Creature("troll", 10, 15, 20, 30);
		default:
			return new Creature("loup", 3, 8, 5, 10);
		}
	}

}
