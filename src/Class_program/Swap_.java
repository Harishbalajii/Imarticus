package Class_program;

import java.util.Scanner;

public class Swap_ {

	public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				String str1 =s.next();
				int len = str1.length();
				char ch[]=str1.toCharArray();
				if(len%2==0) {
					for(int i=1;i<len;i+=2)
						System.out.println(ch[i]+""+ch[i-1]);
					System.out.println(ch[len-1]);
					
				}
				s.close();
	}

				
		
		
		
		
		
		
		
		
		
		
	}

