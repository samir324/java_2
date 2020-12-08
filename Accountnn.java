package aa1;

import java.util.Scanner; // Import the Scanner class

public class Accountnn {
	private String nom;
	private String adress;
	private double solde;

	// Getter
	public String getName() {
		return nom;

	}

	public String getAdress() {
		return adress;

	}

	public double getSolde() {
		return solde;

	}

	// Setter
	public void setName(String newName) {
		this.nom = newName;

	}

	public void setAdress(String newAdress) {
		this.adress = newAdress;

	}

	public void setSolde(double newSolde) {
		this.solde = newSolde;

	}

	public void Testsolde(double soldeDef) {

		if (soldeDef < solde) {
			this.solde = solde - soldeDef;
			System.out.print(solde);
		} else {
			System.out.print("Votre solde est inferieur a solde determiner ");
		}
	}

	public static void main(String[] args) {

		try (Scanner myObj1 = new Scanner(System.in)) {
			System.out.println("Determiner vote solde");

			double soldeDef = myObj1.nextDouble(); // Read user input

			Accountnn client1 = new Accountnn();
			client1.setName("samir");
			client1.setAdress("Casablanca");
			client1.setSolde(150000);
			client1.Testsolde(soldeDef);
		}

		// retirer

		/*
		 * System.out.println(myObj.getName()); 
		 * System.out.println(myObj.getAdress());
		 * System.out.println( myObj.getSolde());
		 */

	}

}
