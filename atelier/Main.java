package aa1;

/*public class Main {

	int x = 10;

	  public static void main(String[] args) {
	    Main myObj = new Main();
	    myObj.x = 25; // x is now 25
	    System.out.println(myObj.x);
	  }

}
*/
public class Main {
	  // Static method
	  static void myStaticMethod() {
	    System.out.println("Static methods can be called without creating objects");
	  }

	  // Public method
	  public void myPublicMethod() {
	    System.out.println("Public methods must be called by creating objects");
	  }

	  // Main method
	  public static void main(String[] args) {
	    myStaticMethod(); // Call the static method
	    // myPublicMethod(); This would compile an error

	    Main myObj = new Main(); // Create an object of Main
	    myObj.myPublicMethod(); // Call the public method on the object
	  }
	}
