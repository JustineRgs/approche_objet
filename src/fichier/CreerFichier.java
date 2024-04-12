package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Users/Tinou/Desktop/DEV/JAVA/approche_objet/src/fichier/recensement.csv");
		Path destinationPath = Paths
				.get("C:/Users/Tinou/Desktop/DEV/JAVA/approche_objet/src/fichier/output/hundredCities.csv");

		List<String> list = Files.readAllLines(path);

		List<String> hundredLines = list.subList(0, Math.min(100, list.size()));

		Files.write(destinationPath, hundredLines);
	}

}
