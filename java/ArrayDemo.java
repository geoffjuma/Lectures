class ArrayOps
{
	public int findMax(int[] myArray)
	{
		int max = myArray[0];
		for (int index = 0; index<myArray.length;index++)
		{
			if (myArray[index]>max)
			{
				max = myArray[index];
			}
		}
		return max;
	}
}
public class ArrayDemo
{
	public static void main(String[] args) 
	{
		int[] theArray = {34,45,23,44,67,12,32,41,65,24};
		ArrayOps ops = new ArrayOps();
		int answer = ops.findMax(theArray);
		System.out.println ("The maximum value here is: " + answer);	
	}
}