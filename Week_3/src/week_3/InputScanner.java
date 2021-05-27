/**
 * 
 */
package week_3;

/**
 * @author ASUS
 *
 */
import java.util.*;
public class InputScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner name = new Scanner(System.in);
		String names = "Misita";
		//Created scanner object
		Scanner keyboard = new Scanner(System.in);
		//Ask the user to enter
		System.out.println("Please enter you name.");
		//Take input from user
		String name1 = keyboard.nextLine();
		//Print the output
		System.out.println(name1);
		//Ask the user to enter age
		System.out.println("Please enter you age.");
		//Take age as input
		int age = keyboard.nextInt();
		//Print age
		System.out.println(age);

	}

}
