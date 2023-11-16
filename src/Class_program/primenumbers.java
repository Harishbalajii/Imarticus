package Class_program;

import java.util.Scanner;

public class primenumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
//		int arr[]= {13,17,21,31,5,999991,23,25};
//	
//		for (int i = 0; i< arr.length;i++) {
//			
//		
//			
//		}
				
	
		int arr[]= {13,17,21,31,5,999991,23,25};
		int k=0 , n=13;
		for(int i=1;i<=n;i++)
		{
			if(n% i ==0)
			{
				k++;
			}
			
		}
		if (k==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
}
		

	}

}
