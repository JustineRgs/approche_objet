package fr.diginamic.entities;

public class Theatre {
private String name;
private int capacity;
private int totalCustomers;
private double totalRecipe;

public Theatre(String name, int capacity, int totalCustomers, double totalRecipe) {
	super();
	this.name = name;
	this.capacity = capacity;
	this.totalCustomers = totalCustomers;
	this.totalRecipe = totalRecipe;
}

public void inscrire(int customers, double price) {
	if (totalCustomers + customers <= capacity) {
		totalCustomers += customers;
		double recipe = customers * price;
		totalRecipe += recipe;
		System.out.println(customers + " client(s) inscrit(s); Total de clients : " + totalCustomers + "; Recette totale du théatre : " + totalRecipe + "€");
	} else {
		System.out.println("La capacité maximale du théatre est atteinte");
	}
}

}
