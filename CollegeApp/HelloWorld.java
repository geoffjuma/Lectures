import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class HelloWorld
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Trying to display some message");
		JOptionPane.showMessageDialog(frame,"Hello this world","Hello World Gui",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);	
	}
}