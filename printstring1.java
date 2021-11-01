package hola;

public class printstring1 {
	private static void printChar(String str)
	{
	
	if(str.length()==0)
	{
		return;
	}
	//mera kaam
		char cc0=str.charAt(0);
		System.out.println(cc0);
		
	//recursive calls faith
	String s=str.substring(1);
	printChar(s);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java";
		printChar(str);
		
	}

}
