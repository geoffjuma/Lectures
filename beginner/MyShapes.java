import java.util.Scanner;
public class MyShapes
 {
 	private int area;
 	private int perimeter;
 	//calculates the area
 	public int calculateArea(int length, int width)
 	{
 		return length*width;
 	}
 	//calculates the perimter
 	public int calculatePerimeter (int length, int width)
 	{
 		return 2*(length+width);
 	}
 	public static void main(String[] args) 
 	{
 		Scanner myscanner = new Scanner(System.in);
 		System.out.print("Please enter the length: ");
 		int length =  myscanner.nextInt();
 		System.out.print("Please enter the width: ");
 		int width =  myscanner.nextInt();
 		//creating an object called rectangle
 		MyShapes rectangle = new MyShapes();
 		rectangle.area = rectangle.calculateArea(length,width);
 		System.out.println ("The area of that Shape is: "+rectangle.area);

 	}
 }