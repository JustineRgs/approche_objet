package sets;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>(Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));
		
		String maxVille = "";
		for (String ville : hashSet) {
			if (ville.length() > maxVille.length()) {
				maxVille = ville;
			}
		}
		
		System.out.println("Ville ayant le plus grand nombre de lettre : " + maxVille);
		hashSet.remove(maxVille);
		System.out.println("Liste sans cette même ville : " + hashSet);

	}

}
