
package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Recensement {
	String nomFichier;
	public List<Ville> villes = new ArrayList<Ville>();

	public Recensement(String nomFichier) throws IOException {
		this.nomFichier = nomFichier;

		Path path = Paths.get(
				"C:/Users/Tinou/Desktop/DEV/JAVA/approche_objet/src/fr/diginamic/recensement/" + nomFichier + ".csv");
		List<String> list = Files.readAllLines(path);

		boolean verif = false;
		for (String line : list) {
			String[] data = line.split(";");

			if (verif == true) {
				villes.add(new Ville(Integer.parseInt(data[0]), data[2], Integer.parseInt(data[5]),
						Integer.parseInt(data[9].replaceAll(" ", "")), data[1], data[6]));
			}

			verif = true;
		}
	}

}
