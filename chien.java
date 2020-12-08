package aa1;

public class chien {
	String nom ="";
	/* public chien(String nom) {
	        this.nom = nom;
	    }*/
	public  void aboyer() {
		// TODO Auto-generated method stub
		System.out.println(nom + " dit wwaaaarf.");
	}
	public  void mange() {
		// TODO Auto-generated method stub
		System.out.println("Je mange de la viande");
	}
	public static void main(String[] args) {

	    chien Rex = new chien();
	    Rex.nom = "Rex";
	    Rex.aboyer(); 
	    Rex.mange(); 
	    
	    chien Max = new chien(); 
	    Max.nom = "Max";
	    Max.aboyer();
	    Max.mange();
	  }
	

}

