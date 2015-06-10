public class Max
{
	public static void main(String[] args)
	{
		int[] myArray = {-20, 19, 1, 5, -1, 27, 19, 5 };
		int max = myArray[0];
		for (int i = 0;i<myArray.length;i++)
		{
			if (myArray[i]>max)
			{
				max = myArray[i];
			}
			
		}
		System.out.println("The element witht the greatest value is: " + max);
	}
}