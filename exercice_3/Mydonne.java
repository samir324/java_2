package exercice_3;

public class Mydonne {
	String nom;
	String adress;
	double solde;
	
	
	public Mydonne(String nom,String adress, double solde ) {
        this.nom = nom;
        this.adress = adress;
        this.solde = solde;
    }
	public  void afficherInfos() {
		
		System.out.print(nom +" habite à "+ "(" + adress +")" + "infos solde " + solde + " DH" );
		System.out.print("\n");
	}


}
