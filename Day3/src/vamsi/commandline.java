package vamsi;

public class commandline {
	public static void main(String[] args)
	{
		int ch=args.length;
		if(ch==0)
			System.out.print("no values");
		else
			for(int i=0;i<ch;i++)
				System.out.print(args[i]+" ,");
				
	}

}
