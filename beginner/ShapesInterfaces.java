import java.util.Scanner;
import java.lang.Math;

class Shapers
{
	private int area, perimeter;
	private int length,width;

	private int calculateArea(int length, int width)
	{
		return this.length*this.width;
	}
	private int calculatePerimeter(int length, int width)
	{
		return 2*(this.length+this.width);
	}
	public int getLength(itn length)
	{	
		return this.length;

	}
	public int getWidth(int width)
	{
		return this.width;
	}
	public int getArea(int length,int width)
	{
		this.length = length;
		this.width = width;
		int area = calculateArea(length,width);
		return area;
	}
	public int getPerimeter(int length, int width)
	{
		this.length = length;
		this.width = width;
		int perim = calculatePerimeter(length,width);
		return perim;
	}
}
public class ShapesInterfaces
{
	public static void main(String[] args) 
	{
		Scanner myScanner = new Scanner(System.in);
		Shapers myShapes = new Shapers();

		System.out.println("Please enter length");
		int length = myScanner.nextInt();
		System.out.println("Please enter width");
		int width = myScanner.nextInt();

		System.out.println(myShapes.getArea(length,width));
	}

}