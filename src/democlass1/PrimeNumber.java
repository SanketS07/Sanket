package democlass1;

public class PrimeNumber {
               // Write a program to find Prime no between 1 to 100
	public static void main(String[] args) {
        int b=0;
	       for (int i=1;i<=100; i++)
	       {
	    	   for (int j=2;j<=i-1; j++)
	    	   {
	    		   if(i%j==0)
	    		   {
	    			   b=b+1;
	    		   }
	    	   }
	    	   if(b==0)
	    	   {
	    		   System.out.println(i);
	    	   }
	    	   else
	    	   {
	    		   b=0;
	    	   }
}
	}
}
