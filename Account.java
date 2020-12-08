package aa1;

public class Account {

	
	String nom;
	String adress;
	double solde;
	double tauxInteret = 0.07;
	
	
	public Account(String nom,String adress, double solde ) {
        this.nom = nom;
        this.adress = adress;
        this.solde = solde;
    }
	public  void afficherInfosSolde() {
		
		System.out.println(solde);
	}
	public  double calculerInterer()  {
		double preinter = solde*tauxInteret;
		return preinter;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account client = new Account("El Alami Hassan","Safi",14765.8);
		client.afficherInfosSolde();
		
		System.out.println(client.calculerInterer());
		
	}
}
