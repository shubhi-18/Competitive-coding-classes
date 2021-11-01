package hola;

public class PrintString {
	private static void printChar(String str)
	{
		//base case
		if(str.length()==0)
		{
			return;
		}
		
		//recursive calls faith
		String s=str.substring(1);
		printChar(s);
		//mera kaam
		char cc0=str.charAt(0);
		System.out.println(cc0);
		
	}
	
	public static void main(String[]args)
	{
		String str="Java";
		printChar(str);
		
	}

}
