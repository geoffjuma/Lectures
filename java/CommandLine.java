public class CommandLine
{
	public static void main(String[] args) 
	{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int area, perim = 0;
		CommandLine myCommand = new CommandLine();
		area = myCommand.calculateArea(x,y);
		perim = myCommand.calculatePerim(x,y);
		System.out.println(area);
		System.out.println(perim);
	}
	public int calculateArea(int length, int width)
	{
		return length*width;
	}
	public int calculatePerim(int length, int width)
	{
		return 2*(length+width);
	}
}