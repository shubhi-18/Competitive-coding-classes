public class StringLengthUsingREcursion {
private static int length(String str) {
	if(str.isEmpty())
	{
		return 0;
	}
	String bachikuchi=str.substring(1);
	int recAns=length(bachikuchi);
	int meraAns=recAns+1;
	return meraAns;
	
}
public static void main(String[]args)
{
	String str="JAVA";
	System.out.println(length(str));
	
}
}
