package Class_program;

import java.util.Scanner;

public class find_sum_of_digits {

	public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	int n = s.nextInt();
	int rem,sum1=0;
	while(n>0) {
		rem=n%10;
		n=n/10;
		System.out.print(rem);
		
	}
System.out.println(sum1);
s.close();
	}

}
