import javax.swing.*;
import java.awt.*;
abstract class MyShapes
{
	private int perimeter;
	private int area;
	MyShapes()
	{
		perimeter = 0;
		area = 0;
	}

	public abstract int calculateArea();
	public abstract  int calculatePerimeter(); 
}
class Rectangle extends MyShapes
{
	private int length;
	private int width;
	Rectangle(int length, int width)
	{
		super();
		this.length = length;
		this.width = width;
	}
	public int calculateArea()
	{
		return length*width;
	}
	public int calculatePerimeter()
	{
		return 2*(length+width);
	}
	public void paint(Graphics g)
	{
		g.drawRect(0,0,20,10);
	}
}

public class Shapes
{
	public static void main(String[] args) 
	{
		//Rectangle rect = new Rectangle(20,10);
		JFrame myFrame = new JFrame("Playing Canvass");
		myFrame.setSize(300,300);
		myFrame.getContentPane().add(new JPanel());
		myFrame.setVisible(true);
		//System.out.println(rect.calculateArea());
	}
}