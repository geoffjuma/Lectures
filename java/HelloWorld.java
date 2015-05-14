public class HelloWorld
{
	private String text = "Hello Strathmore";
	public static void main(String[] args) 
	{
		HelloWorld object1  = new HelloWorld();
		object1.displayText();
	
	}
	public void displayText()
	{
		System.out.println(text);
	}
}