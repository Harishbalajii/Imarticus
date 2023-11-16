package Class_program;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int temp =n,rev=0,rem;
		while(n>0) {
		rem=n%10;
		rev=(rev*10)+rev;
		n=n/10;
		}
		if(temp==rev)
		System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		
				
		
	}

}
