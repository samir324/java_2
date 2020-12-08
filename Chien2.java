package aa1;

public class Chien2 {

	
	
	String nom;
	public Chien2(String nom) {
	        this.nom = nom;
	    }
	
	
	
	 public void Aboyer(String sens){
	        if (sens.equalsIgnoreCase("Angry")){
	            System.out.print("Je suis en colère. Ghhhhhhhhhh !!! WWWWOARF !! WWWWOARF !!");
	        }else if (sens.equalsIgnoreCase("Cool")){
	            System.out.print("Je ne suis pas du tout en colère. Iwiw !! awaw !!");
	        }else {
	            System.out.print(nom + " dit wwaaaarf,");
	        }
	    }

	    public void Manger(String food){
	        if (food.equalsIgnoreCase("Fish")){
	            System.out.print(" Je mange du poisson");
	        }else {
	            System.out.println(" Je mange de la viande");
	        }

	    }

	    public static void main(String[] args) {
	        Chien2 Rex = new Chien2("Rex");
	        Rex.Aboyer("Angry");
	        Rex.Manger("qlql");

	        Chien2 Max = new Chien2("Max");
	        Max.Aboyer("cool");
	        Max.Manger("fish");
	    }
	    
	    
	    
	    
	    
	    
	    
	 
	


}
