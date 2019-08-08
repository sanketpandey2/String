package Maths;

import java.util.Scanner;

public class Prime {
	
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int i = sc.nextInt();  
		sc.close();
		boolean flag= false;
		if(i==1) {
			System.out.println("NOt Prime");
			flag =true;
		}
	
		int j;
		
		
		for (j=2;j<i;j++) {
			if(i%j==0) {
				flag = true;
				break;
			}
			
		}
		
		if(!flag && i != 1) {
			System.out.println("Prime");
		}
		else if(flag && i != 1)
			System.out.println("NOt Prime");
		
		
		
		
		
		
		
		
		
		
		
	}
}
