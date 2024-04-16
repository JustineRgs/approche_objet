package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		long debut = System.currentTimeMillis();
		String chaine = "";
		for (int i = 0; i <= 100000; i++) {
			chaine = chaine + 1;
		}
		long fin = System.currentTimeMillis();
		
		System.out.println("1) Temps écoulé en millisecondes :" + (fin - debut) + "ms");
		;

		long debut2 = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i <= 100000; i++) {
			builder.append(i);
		}
		String chaine2 = builder.toString();
		long fin2 = System.currentTimeMillis();
		System.out.println("2) Temps écoulé en millisecondes :" + (fin2 - debut2) + "ms");


	}

}
