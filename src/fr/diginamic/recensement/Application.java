package fr.diginamic.recensement;

import java.io.IOException;
import java.util.Scanner;

public class Application {
	static Scanner scanner;

	public static void main(String[] args) throws IOException {
		Recensement recensement = new Recensement("recensement");
		System.out.println("1. Population d’une ville donnée \n" + "2. Population d’un département donné \n"
				+ "3. Population d’une région donnée \n" + "4. Afficher les 10 régions les plus peuplées \n"
				+ "5. Afficher les 10 départements les plus peuplés \n"
				+ "6. Afficher les 10 villes les plus peuplées d’un département \n"
				+ "7. Afficher les 10 villes les plus peuplées d’une région \n"
				+ "8. Afficher les 10 villes les plus peuplées de France \n" + "9. Sortir");
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		switch (n) {
		case 1:
			System.out.println("Entrez le code commune de la ville :");
			PopulationParVille populationParVille = new PopulationParVille();
			populationParVille.traiter(recensement, scanner);
			break;
		case 2:
			System.out.println("Entrez le code département :");
			PopulationParDepartement populationParDepartement = new PopulationParDepartement();
			populationParDepartement.traiter(recensement, scanner);
			break;
		case 3:
			System.out.println("Entrez le code région :");
			PopulationParRegion populationParRegion = new PopulationParRegion();
			populationParRegion.traiter(recensement, scanner);
			break;
		case 4:
			RechercheDixRegionsPlusPeuplees dixRegionsPlusPeuplees = new RechercheDixRegionsPlusPeuplees();
			dixRegionsPlusPeuplees.traiter(recensement, scanner);
			break;
		case 5:
			RechercheDixDepartementsPlusPeuples dixDepartementsPlusPeuplees = new RechercheDixDepartementsPlusPeuples();
			dixDepartementsPlusPeuplees.traiter(recensement, scanner);
			break;
		case 6:
			System.out.println("Entrez le code département :");
			RechercheVillesParDepartement dixVillesParDepartement = new RechercheVillesParDepartement();
			dixVillesParDepartement.traiter(recensement, scanner);
			break;
		case 7:
			System.out.println("Entrez le code région :");
			RechercheVillesParRegion dixVillesParRegion = new RechercheVillesParRegion();
			dixVillesParRegion.traiter(recensement, scanner);
			break;
		case 8:
			System.out.println("10 villes les plus peuplées de France :");
			VillesMaxPopulation mesVillesMaxPop = new VillesMaxPopulation();
			mesVillesMaxPop.traiter(recensement, scanner);
			break;
		case 9:
			break;
		default:
			break;
		}

		scanner.close();

	}

}