package Class_program;

import java.util.Scanner;

public class pro2 {

	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		int digit=0,letter=0,vowel=0,consonant=0,special=0;
		String str1=s.next();
		char ch[]=str1.toCharArray();
		for (int i=0;i<ch.length;i++) {
			if(Character.isLetter(ch[i])) {
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'
						 ||ch[i]=='A'||ch[i]=='E'||ch[i]=='O'||ch[i]=='I'||ch[i]=='U' )
				{
					if(vowel==0)
						vowel=i+1;
					//flag=1
				}
				else if (consonant==0) {
					consonant=i+1;
					//break;
				System.out.println("vowels");
				}
				
			}
	

		System.out.println("vowel:"+vowel);
		System.out.println("consontant:"+consonant); 
		
	
		
	
	}


		
		
		
		

	}


