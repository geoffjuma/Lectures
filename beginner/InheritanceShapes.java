/* @geoffjuma
STRATHMORE UNIVERSITY
Illustrating Inheritance and overriding as CORE OOP Concepts
creates a super class called Shapes with Rectangle, Circle and Square
as subclasses
Overides methods calculateAre and calculatePerim in the subclasses

GPL License. :) :)
*/
import java.lang.Math;
class Shapes
{
	protected double area, perimeter;
	public Shapes()
	{
		double area = 0;
		double perimeter = 0;
	}
	public double calculateArea()
	{
		//Generic fro all shapes must calculates Are
		//implemeted/overrided in subclasses
		return 0.0;
	}
	public double calculatePerim()
	{
		//Generic for all shapes must have perimeter
		//implementational details are in sublcasses
		return 0.0;
	}

}
class Circle extends Shapes
{
	//private final double PI = 3.142;
	private double radius;
	//Circle constructor below
	public Circle(double radius)
	{
		//super class/base class
		super ();
		//initializing variable for Circle class
		this.radius = radius;
		
		
	}
	//Overriding the calculate area in the super class
	public double calculateArea()
	{
		return Math.PI*Math.pow(radius,2); 
	}
	public double calculatePerim()
	{
		return 2*Math.PI*radius;
	}

}
class Rectangle extends Shapes
{
	private double length,width;
	//Rectangle's constructor
	public Rectangle(double length,double width)
	{
		//calling the contructor for the super class
		super ();
		//initializing rectangle's variables
		length = this.length;
		width = this.width;
	}
	public double calculateArea()
	{
		return length*width;
	}
	public double calculatePerim()
	{
		return 2*(length+width);
	}
}
class Square extends Shapes
{
	private double length,width;
	//Square's constructor
	public Square(double length,double width)
	{
		//calling the contructor for the super class
		super ();
		//initializing rectangle's variables
		length = this.length;
		width = this.width;
	}
	public double calculateArea()
	{
		return length*width;
	}
	public double calculatePerim()
	{
		return 2*(length+width);
	}
}
public class InheritanceShapes extends Shapes
{
	public static void main(String[] args) 
	{
		Shapes myCircle = new Circle(44.00);
		myCircle.area = myCircle.calculateArea();
		myCircle.perimeter = myCircle.calculatePerim();
		System.out.println("The area of the circle is: "+myCircle.area);
		System.out.println("The circumference of the circle is: "+myCircle.perimeter);
	}

}