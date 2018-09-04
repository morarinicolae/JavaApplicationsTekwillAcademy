/*
Write an application that asks a user to enter an integer. Display a statement that indicates whether the integer is even or odd.
*/

//import java.util.Scanner;
import javax.swing.JOptionPane; 
public class NumereOdd
        
{
   public static void main(String args[])
   {
      String inputNumber;
      //int x;
       inputNumber = JOptionPane.showInputDialog("Enter an integer to check if it is odd or even ");	
// Scanner in = new Scanner(System.in);
      //x = in.nextInt();
      //Integer.parseInt(inputNumber);
   	
     // if ( inputNumber% 2 == 0 ){
     if ( Integer.parseInt(inputNumber)% 2 == 0 ){
        System.out.println("You entered an even number.");
      //JOptionPane.showMessageDialog("You entered an even number.");
      }
      else
         System.out.println("You entered an odd number.");
   }
}