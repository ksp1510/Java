/**
 * 
 */
package week_3;

/**
 * @author ASUS
 *
 */
import javax.swing.JOptionPane;
public class InputJoptionpane {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Please enter your name");
		//Print the output
		JOptionPane.showMessageDialog(null, name);
		//Take input from the user for age
		String input = JOptionPane.showInputDialog("Please enter your age");
		//convert input to int
		int age = Integer.parseInt(input);
		//Print the output
		JOptionPane.showMessageDialog(null, input);

	}

}
