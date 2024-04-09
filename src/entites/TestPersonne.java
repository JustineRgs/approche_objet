package entites;

public class TestPersonne {

	public static void main(String[] args) {
		AdressePostale adr1 = new AdressePostale("12", "rue du Marché", 34000, "Montpellier");
		Personne pr1 = new Personne("Justine", "RAGUES", adr1);
		  System.out.println(pr1);
	}

}
