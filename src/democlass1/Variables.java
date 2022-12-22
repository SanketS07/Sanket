package democlass1;
public class Variables {
		static int c= 20;               // static variables
	       int b=10;                // instance variables
	
	public static void main(String[] args) {
	
		int a =30;                   // local variables
		
		Variables variable = new Variables ();       //object create reference 
		
		Variables.xyz();                      // calling another method in main method
		variable.abc();
		System.out.println("Local Variables is " + a);                 // calling local variables
		System.out.println("static variables is " +Variables.c);      // calling static variables
		System.out.println("instance variables is "+variable.b);         // calling instance variables
		
	}
	 static void xyz(){
		int d=40;                            // local variables
		
		Variables ss=new Variables ();       //object create
		
		System.out.println("Local Variables in Methods "+ d);               // calling local variables
		System.out.println("static variables in Methods " +Variables.c);     // calling static variables
		System.out.println("instance variables in Methods "+ss.b);            // calling instance variables

	}
	  public void abc()
	  {
			System.out.println("Local Variables in Methods abc "+ c);               // calling local variables

	  }
}






