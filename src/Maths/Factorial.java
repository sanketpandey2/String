package Maths;

public class Factorial {
	
	public static void main(String[] args) {
		int i = 4;
		int fact=1;
		for(int k=i;k>0;k--) {
			
			fact= fact*k;
		}
		System.out.println(fact);
	}

}
