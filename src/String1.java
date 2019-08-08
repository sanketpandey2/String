import java.util.Scanner;

//Given a string, S, of length N that is indexed from 0 to N - 1, print its even-indexed and odd-indexed characters
//as 2 space-separated strings on a single line (see the Sample below for more detail).
public class String1 {
	
	public static void main(String[] args) {
		//System.out.println("Enter the string");
	
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of strings");
		int k = s.nextInt();
		String first="";
		String second="";
	System.out.println("e1");	
	String s1= s.nextLine();;
		
		for (int l=0;l<k;l++){
			
		first="";
		second="";
	
		System.out.println("e2");	
		 s1= s.nextLine();
		
             for(int j=0;j<s1.length();j++) {
			char[]	s2= s1.toCharArray();
			if (j%2==0) {
				
				first= first+s2[j];
			}
			else {
				second = second+s2[j];
			}
		} 
		System.out.println(first +"  " +second);
		}
	}

}
