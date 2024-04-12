package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Users/Tinou/Desktop/DEV/JAVA/approche_objet/src/fichier/recensement.csv");
		List<String> list = Files.readAllLines(path);

		for (String line : list) {
			System.out.println(line);
		}

		ArrayList<Ville> cities = new ArrayList<>();

		for (int i = 1; i < list.size(); i++) {
			String line = list.get(i);
			String[] tokens = line.split(";");

			String name = tokens[6];
			String numDepartment = tokens[2];
			String nameRegion = tokens[1];
			String population = tokens[9].trim().replaceAll(" ", "");
			int totalPopulation = Integer.parseInt(population);

			Ville ville = new Ville(name, numDepartment, nameRegion, totalPopulation);
			cities.add(ville);
		}

		for (Ville city : cities) {
			System.out.println(city);
		}

		// Cities > 25000
		Path destinationPath = Paths
				.get("C:/Users/Tinou/Desktop/DEV/JAVA/approche_objet/src/fichier/output/bigcity.csv");

		String header = "Nom;Code département;Nom de la région;Population totale\n";
		Files.write(destinationPath, header.getBytes());

		for (Ville city : cities) {
			if (city.getTotalPopulation() >= 25000) {
				String cityInfo = city.getName() + ";" + city.getNumDepartment() + ";" + city.getNameRegion() + ";"
						+ city.getTotalPopulation() + "\n";
				Files.write(destinationPath, cityInfo.getBytes(), java.nio.file.StandardOpenOption.APPEND);
			}
		}

		// PopulationByDepartment
		Path destinationPopulationPath = Paths
				.get("C:/Users/Tinou/Desktop/DEV/JAVA/approche_objet/src/fichier/output/populationByDepartment.csv");

		String headerPopulationByDepartment = "Code département;Population totale\n";
		Files.write(destinationPopulationPath, headerPopulationByDepartment.getBytes());

		Map<String, Integer> populationByDepartment = new HashMap<>();

		for (Ville city : cities) {
			String department = city.getNumDepartment();
			int population = city.getTotalPopulation();

			populationByDepartment.put(department, populationByDepartment.getOrDefault(department, 0) + population);
		}

		for (Map.Entry<String, Integer> entry : populationByDepartment.entrySet()) {
			String department = entry.getKey();
			int totalPopulation = entry.getValue();

			String departmentPopulationInfo = department + ";" + totalPopulation + "\n";
			Files.write(destinationPopulationPath, departmentPopulationInfo.getBytes(),
					java.nio.file.StandardOpenOption.APPEND);
		}

	}
}
