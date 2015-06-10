import java.io.*;
public class ReadMe
{
	public static void main(String[] args) 
	{
		String userName = null;
		String password = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");
		System.out.println("Enter your password: ");

		try
		{
			
			userName = br.readLine();
			password = br.readLine();
		}
		catch(IOException ioe)
		{
			System.out.println("IOE Error trying to read you details");
			System.exit(1);
		}
		System.out.println("Your name is: " +userName);
		System.out.println("Your password is: "+password);
	}
}