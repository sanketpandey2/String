package Maths;

public class Pattern {
	
	public static void main(String[] args) {

		int n=6;
		int i, j;
		 for(i=1; i<=n; i++) 
	        { 
	  
	            // inner loop to handle number spaces 
	            // values changing acc. to requirement 
	            for(j=2*(n-i); j>=0; j--) 
	            { 
	                // printing spaces 
	                System.out.print(" "); 
	            } 
	             
	            //  inner loop to handle number of columns 
	            //  values changing acc. to outer loop 
	            for(j=1; j<=i; j++) 
	            { 
	                // printing stars 
	                System.out.print("* "); 
	            } 
	              
	            // ending line after each row 
	            System.out.println(); 
		
		
	
		
		
	        }}
}
