package listes;

public class TestEquals {
    public static void main(String[] args) {
        Ville ville1 = new Ville("Paris", 1000000);
        Ville ville2 = new Ville("Paris", 1000000);
        Ville ville3 = new Ville("Londres", 2000000);


        System.out.println("Test de la méthode equals :");
        System.out.println("ville1.equals(ville2) : " + ville1.equals(ville2));
        System.out.println("ville1.equals(ville3) : " + ville1.equals(ville3));

        System.out.println("\nTest de l'opérateur == :");
        System.out.println("ville1 == ville2 : " + (ville1 == ville2)); 
        System.out.println("ville1 == ville3 : " + (ville1 == ville3)); 
    }
}

