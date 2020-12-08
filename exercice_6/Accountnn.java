package exercice_6;

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

}
