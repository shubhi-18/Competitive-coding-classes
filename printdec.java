public class PrintDecreasing {

	private static int printdec(int n)
	{ 
		if(n==0)
		{
			return 0;
		}
		System.out.println(n);
		int recAns=printdec(n-1);
		return recAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printdec(5);
	}

}
