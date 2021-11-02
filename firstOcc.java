public class firstOcc {
	private static int firstOcc(int []arr,int ci, int search)
	{
		//base case
		if(arr.length==ci)
		{
			return -1;
		}
		if(arr[ci]==search)
		{
			return ci;
		}
		int recAns= firstOcc(arr,ci+1,search);
		return recAns;
		
	}
	
	public static void main(String[]args)
	{
		int arr[]= {10,20,30,40,50};
		System.out.println(firstOcc(arr,1,50));
	}

}
