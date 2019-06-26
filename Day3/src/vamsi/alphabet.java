package vamsi;

public class alphabet {
	public static void main(String[] args)
	{
		char c='+';

		if((c>='A'&&c<='z')||(c>='a'&&c<='z'))
		{
			System.out.println("Alphabet");
			
		}
		else if(c>=0&&c<=9)
		{
	System.out.println("Digit");
		}
		else {
			System.out.println("Special charters");
		}
		
	}

}
