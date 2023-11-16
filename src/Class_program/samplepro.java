package Class_program;

import java.util.Scanner;

public class samplepro {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
     int n,k;
     n=s.nextInt();
     k=s.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++) {
    	 a[i]=s.nextInt();
    	 if(a[i]%k==0)
    		 System.out.println(" 1 ");
    	 else {
    		 System.out.println(" 0 ");
    	 }
    		 
    	 
    		 
     }
	}

}
