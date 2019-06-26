package vamsi;

public class gender {
	public static void main(String[] args) {
		if (args[0].equals("female")&&(Integer.parseInt(args[1])>=1&&Integer.parseInt(args[1])<=58))
			System.out.println("percentage interset is 8.2%");
	
	else if (args[0].equals("female")&&(Integer.parseInt(args[1])>=59&&Integer.parseInt(args[1])<=100))
		System.out.println("percentage interset is 9.2%");
	else if (args[0].equals("male")&&(Integer.parseInt(args[1])>=1&&Integer.parseInt(args[1])<=58))
		System.out.println("percentage interset is 8.4%");
	else if (args[0].equals("male")&&(Integer.parseInt(args[1])>=59&&Integer.parseInt(args[1])<=100))
		System.out.println("percentage interset is 10.5%");
		
	}
		
	

}
