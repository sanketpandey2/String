package Maths;

public class Sorting {
	public static void main(String[] args) {
		int[] a = {5,3,8,3,5,5,89,75};
		
		

		
		for(int i=0; i<a.length; i++) {
			
			for( int j =i;j>0;j--) {
				if(a[j]<a[j-1]) {
					int temp = a[j-1];
					
					a[j-1]=a[j];
					
					a[j]=temp;
				}
			}
		
			
		}
		
		
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}
		
	}

}
