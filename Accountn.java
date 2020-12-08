package aa1;

public class Accountn {

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
	  
	  
	  
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accountn myObj = new Accountn();
		myObj.setName("samir");
		myObj.setAdress("youssoufia");
		myObj.setSolde(150000);
		System.out.println(myObj.getName());
		System.out.println(myObj.getAdress());
		System.out.println( myObj.getSolde());
		
		
	}

}
