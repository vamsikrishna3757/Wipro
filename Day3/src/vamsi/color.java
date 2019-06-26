package vamsi;
import java.util.Scanner;

public class color {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	char c =sc.next().charAt(0);
	switch(c) {
	case 'O':System.out.print("Orange");break;
	case 'B':System.out.print("blue");break;
	case 'G':System.out.print("Green");break;
	case 'Y':System.out.print("Yellow");break;
	case 'W':System.out.print("White");break;
	default:System.out.print("Invalid choice");break;
	}
	
	
	
	}

}
