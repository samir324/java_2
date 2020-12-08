package exercice_3;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mydonne person1 = new Mydonne("El Alami Hassan ","Safi",14765.8);
		Mydonne person2 = new Mydonne("Karimi Khalid ","Casablanca",7654.0);
		//System.out.print(person1.nom +" habite à "+ "(" + person1.adress +")" + "infos solde " + person1.solde + " DH" );
		//System.out.print("\n");
		person1.afficherInfos();
		person2.afficherInfos();

		//System.out.print(person2.nom +" habite à "+ "(" + person2.adress +")" + "infos solde " + person2.solde + " DH" );
		
	}
}
