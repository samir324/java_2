package exercice_6;

import java.util.Scanner;

public class Main {
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
		 * System.out.println(myObj.getName()); System.out.println(myObj.getAdress());
		 * System.out.println( myObj.getSolde());
		 */

	}
}
