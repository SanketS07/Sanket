package democlass1;

public class Sanket {

	
	int a=10;                        // instance variables
	
	public void sa()                // non static method
			{
		System.out.println("good morning");
			}
	
	public static void main(String[] args) {
		
		 Sanket abc=new  Sanket();               // object create
		 
		 abc.sa();
		 System.out.println(abc.a);
		

	}

}
