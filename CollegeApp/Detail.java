import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class Detail
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		String name;
		float answer;
		int num1, num2;
		name = JOptionPane.showInputDialog("Please enter your name");
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter CAT1"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter CAT2 "));
		answer = (num2+num1)/2;
		JOptionPane.showMessageDialog(frame, "Damn! "+name+" ,your average is "+answer+" ",
			"User Details",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);

	}
}