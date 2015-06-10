import java.lang.Math.*;
import java.util.Scanner;

public class InputShape
{
	private double area;
	private double length;
	private double width;
	private double perimeter;

public InputShape(double myLength, double myWidth)
{
	length = myLength;
	width = myWidth;
	area = 0.0d;
	perimeter = 0.0d;
}
public static void main(String[] args) 
{
	double myArea, myPerimeter = 0.0d;
	double theLength,theWidth = 0.0d;

	Scanner myscanner = new Scanner(System.in);
	System.out.print("Please enter the length: ");
	theLength = myscanner.nextDouble();
	System.out.print("Please enter the width: ");
	theWidth = myscanner.nextDouble();

	InputShape shape1 = new InputShape(theLength,theWidth);
	boolean answer = shape1.compare();
	if (answer ==true)
	{
		myArea = shape1.squareArea();
		myPerimeter = shape1.squarePerim();
		//System.out.println("length "+shape1.length);
		System.out.println("the area of the square called shape1 is: " +myArea);
		System.out.println("the perimeter of the square called shape1 is: "+myPerimeter);
	}
	else
	{
		myArea = shape1.rectArea();
		myPerimeter = shape1.rectPerimeter();
		System.out.println("the area of the rectangle shape1 is: " +myArea);
		System.out.println("the perimeter of the rectangle shape1 is: "+myPerimeter);
	}

}
public double rectArea()
{
	area = length*width;
	return area;
}
public double rectPerimeter()
{
	perimeter = 2*(length+width);
	return perimeter;
}
public double squareArea()
{
	area = length*length;
	return area;
}
public double squarePerim()
{
	perimeter = 4*length;
	return perimeter;
}
public boolean compare()
{
	if (length==width)
	{
		return true;
	}
	else
	{
		return false;
	}
}
}