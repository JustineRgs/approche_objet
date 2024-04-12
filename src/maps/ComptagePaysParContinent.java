package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComptagePaysParContinent {
	public static void main(String[] args) {

		List<Pays> paysList = new ArrayList<>();
		paysList.add(new Pays("France", 65000000, "Europe"));
		paysList.add(new Pays("Allemagne", 80000000, "Europe"));
		paysList.add(new Pays("Belgique", 10000000, "Europe"));
		paysList.add(new Pays("Russie", 150000000, "Asie"));
		paysList.add(new Pays("Chine", 1400000000, "Asie"));
		paysList.add(new Pays("Indonésie", 220000000, "Océanie"));
		paysList.add(new Pays("Australie", 20000000, "Océanie"));

		Map<String, Integer> paysByContinent = new HashMap<>();
		for (Pays pays : paysList) {
			String continent = pays.getContinent();
			paysByContinent.put(continent, paysByContinent.getOrDefault(continent, 0) + 1);
		}

		System.out.println("Nombre de pays par continent :");
		for (Map.Entry<String, Integer> entry : paysByContinent.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
