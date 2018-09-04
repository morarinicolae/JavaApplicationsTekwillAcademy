
/*
* Write a program that accepts a number of minutes and converts it both to hours
*and days. For example, 6000 minutes equals 100 hours and equals 4.167 days. Save
*the class as MinutesConversion.java.
*/
import javax.swing.JOptionPane;

public class MinutesConversion {

	public static void main(String[] args) {		
		String inputMinutes;
		int hours;
		float days;									
		inputMinutes = JOptionPane.showInputDialog(null, "Please enter minutes for conversion", "Minutes Conversion", JOptionPane.INFORMATION_MESSAGE);		
	     hours = Integer.parseInt(inputMinutes) / 60; 
	     days = hours / 24.0f;				    
	     JOptionPane.showMessageDialog(null, "There are " + hours + " hour(s)" + " in " + inputMinutes + " minutes.", "Minutes to Hours", JOptionPane.INFORMATION_MESSAGE);
		 JOptionPane.showMessageDialog(null, "There are " + days + " day(s)" + " in " + inputMinutes + " minutes.", "Minutes to Days ", JOptionPane.INFORMATION_MESSAGE);
		
		
	}

}