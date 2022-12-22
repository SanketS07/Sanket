package democlass1;

public class GreaterNumber {
     //Write a Program to find Greater no from given 3 no
	public static void main(String[] args) {
		

        int a=40, b=50, c=60;
        
        if (a>b && a>c)     
        {
        	System.out.println("a is greater");
        }
        else if (b>c && b>a)                       
        {
        	System.out.println("b is greater");
        }
        else
        {
        	System.out.println("c is greater");
        }
	}

}
