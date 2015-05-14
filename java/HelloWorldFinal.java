public class HelloWorldFinal
{
	private String text;
	public HelloWorldFinal()
	{
		text = "Hello World";
	}
	public static void main(String[] args) 
	{
		HelloWorldFinal messsage = new HelloWorldFinal();
		messsage.printHelloWorld();
	}
	public void printHelloWorld()
	{
		System.out.println(text);
	}
}