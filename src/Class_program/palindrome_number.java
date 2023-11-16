package Class_program;

import java.util.Scanner;

public class palindrome_number {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		String str1 = s.next();
		StringBuffer sb = new StringBuffer(str1);
		if(str1.equalsIgnoreCase(sb.reverse().toString()))
		System.out.println("palindrome");
		else
			System.out.println("Not a palindrome");
		s.close();
		
		
		
		

	}

}
