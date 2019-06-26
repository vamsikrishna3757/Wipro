package vamsi;
import java.util.Scanner;
public class Myclass {

	public static void main(String[] args) {
	int age,rollno;
	String name;
	float cgpa;
	boolean flag;
	System.out.println("enter the details:");
	Scanner sc=new Scanner (System.in);
	age=sc.nextInt();
	rollno=sc.nextInt();
	name=sc.next();
	cgpa=sc.nextFloat();
	if(cgpa>=8)
	{
		flag=true;
	}
	else {
		flag=false;
	}
	System.out.println("details is:"+age+ "\n" +rollno+ "\n" +name+ "\n" +cgpa+ "\n" +flag);
	}

}
