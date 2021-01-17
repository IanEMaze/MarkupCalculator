// Ian Maze
// COP2552.001
// Item Markup Calculator

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Project1 {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		//variables that will be used
		String itemNumber;
		String description;
		float currentPrice;
		float PercentMarkup;
		float newPrice;
		
		//Step 1 get item number with display box
		itemNumber = JOptionPane.showInputDialog("Markup Calculator\n\nPlease enter Item Number: ");
		
		//Step 2 get item description with display box
		description = JOptionPane.showInputDialog("Markup Calculator\n\nPlease enter Item Description: ");
		
		//Step 3 get item current price with display box
		currentPrice = Float.parseFloat(JOptionPane.showInputDialog("Markup Calculator\n\nPlease enter Item's Current Price: "));
		
		//Step 4 get item markup
		PercentMarkup = Float.parseFloat(JOptionPane.showInputDialog("Markup Calculator\n\nPlease enter Item Percent Markup: "));
		
			//percent calculation
		PercentMarkup = PercentMarkup / 100 + 1;
		
		//Step 5 calculate newPrice with current price multiplied by markup
		newPrice = currentPrice * PercentMarkup;
		
		//Step 6 display current price and end program
		JOptionPane.showMessageDialog(null, String.format("Markup Calculator\n\nItem Number: " + itemNumber + "\nItem Description: " 
		+ description + "\nItem Current Price: $%,.2f\n\nItem's New Price: $%,.2f\n", currentPrice, newPrice));
		
			//end program
		System.exit(0);
		
	}

}
