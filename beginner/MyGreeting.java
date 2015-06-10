public class MyGreeting
{
	public static void main(String[] args) 
	{
		Greetings hello = new Greetings();
		hello.helloWorld();
	}
}
class Greetings
{
	private String text = "Hello World!";
	private int[][] myArray = new int[10][10];
	public void helloWorld()
	{
		for (int i =0;i<10;i++)
		{
		for(int j = 0; j<10;j++)
			{
				System.out.println(myArray[i][j] + " ");
			}
			
			System.out.println("\n");
		}
			
		//System.out.println(text);
	}
}