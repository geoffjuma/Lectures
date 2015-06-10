/** Introducing OOP
Class shapes define the general parameters required to create an object 
*/
public class Shapes
{
	static final double PI = 3.1423;
	private int area;
	private int perimeter;
	private int length;
	private int width;
	//main method
	//Execution begins from here
	//creates an object of class shapes names shape1
	//calls functions for calculation area
	//@params accepts commandline arguments 
	public static void main(String[] args) 
	{
			Shapes shape1 = new Shapes(4000,4000);
			int myPerim = shape1.perimeter();
			System.out.println("The perimeter of shape1 is: " +myPerim);
			boolean answer = true;
			if ((shape1.compare())==answer)
			{
				int myArea = shape1.square();
				System.out.println("The area of the square is: " +myArea);
			}
			else
			{
				int myArea = shape1.rectangle();
				System.out.println("The area of the rectangle is: " +myArea);
			}

	}
//Constructor for initializing the instance variables
//@params mylength and mywidth denotes the length and the width of the shape
	public Shapes (int mylength, int mywidth)
	{
		area = 0;
		perimeter = 0;
		length = mylength;
		width = mywidth;
	}
//Calculates the area of rectangle
//@return returns the area calculated
	public int rectangle()
	{
		area = length*width;
		return area;
	}
	public int square()
	{
		area = width*length;
		return area;
	}
	//compares the length and width
	//@returns boolean whether true or false
	public boolean compare()
	{
		if (length == width)
		{
			System.out.println("OOOOOH!!! Looks like a SQUARE dude!");
			return true;
		}
		else
		{
			System.out.println("it's a RECTANGLE girl!");
			return false;
		}
	}
	public int perimeter()
	{
		perimeter = 2*(length+width);
		return perimeter;
	}
}