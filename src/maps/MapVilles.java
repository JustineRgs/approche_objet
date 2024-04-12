package maps;

import java.util.HashMap;
import java.util.Map;

import listes.Ville;

public class MapVilles {

	public static void main(String[] args) {
		Map<String, Ville> mapVilles = new HashMap<>();

        mapVilles.put("Paris", new Ville("Paris", 2190327));
        mapVilles.put("Marseille", new Ville("Marseille", 861635));
        mapVilles.put("Lyon", new Ville("Lyon", 516092));
        mapVilles.put("Toulouse", new Ville("Toulouse", 486828));
        mapVilles.put("Nice", new Ville("Nice", 342522));
        
        double minPopulation = Integer.MAX_VALUE;
        String villeMoinsPeuplee = null;
        for (Map.Entry<String, Ville> entry : mapVilles.entrySet()) {
            double population = entry.getValue().getPopulation();
            if (population < minPopulation) {
                minPopulation = population;
                villeMoinsPeuplee = entry.getKey();
            }
        }
        mapVilles.remove(villeMoinsPeuplee);
        System.out.println("Ville avec le moins d'habitants supprimée : " + villeMoinsPeuplee);
        System.out.println();
        
        System.out.println("Villes restantes :");
        for (Ville ville : mapVilles.values()) {
            System.out.println(ville);
        }
	}

}
