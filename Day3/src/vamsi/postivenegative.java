package vamsi;

import java.util.Scanner;

public class postivenegative {
	public static void main(String[] args)
	{
		int i,j;
		System.out.println("enter the number: ");
		Scanner sc= new Scanner(System.in);
		 i=sc.nextInt();
		 if(i>0)
		 {
			 System.out.println("The number is positive");
		 }
		 else if(i<0)
		 {
			 System.out.println("the number is negative");
			 
		 }
		 else {
			 System.out.println("number is equal");
		 }
		
		
	}

}
