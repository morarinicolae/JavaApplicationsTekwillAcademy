/*
public class Ascending {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter first integer: ");
      int number1 = input.nextInt();
    System.out.print("Enter second integer: ");
    int number2 = input.nextInt();
    System.out.print("Enter third integer: ");    
    int number3 = input.nextInt();


    if (number1 > number2) {
      int temp = number1;
      number1 = number2;
      number2 = temp;
    }

    if (number2 > number3) {
      int temp = number2;
      number2 = number3;
      number3 = temp;
    }

     if (number1 > number2) {
      int temp = number1;
      number1 = number2;
      number2 = temp;
    }

    
    System.out.println("The sorted numbers are "
      + number1 + " " + number2 + " " + number3);
  }
}

*/

import javax.swing.JOptionPane;

public class Ascending 
{
    public static void main(String[] args) 
    {
        String stringNum1 = JOptionPane.showInputDialog(null, "Please enter 1st Integer: ");
        String stringNum2 = JOptionPane.showInputDialog(null, "Please enter 2nd Integer: ");
        String stringNum3 = JOptionPane.showInputDialog(null, "Please enter 3rd Integer: ");
        int num1 = Integer.parseInt(stringNum1);
        int num2 = Integer.parseInt(stringNum2);
        int num3 = Integer.parseInt(stringNum3);

        if ((num1 > num2 && num1 > num3))
        {
            if(num2 > num3)
            {
                System.out.print(num3 + " " + num2 + " " + num1);
            }
            else
                System.out.print(num2 + " " + num3 + " " + num1);
        }
        else if ((num2 > num1 && num2 > num3))
        {
            if(num1 > num3)
            {
                System.out.print(num3 + " " + num1 + " " + num1);
            }
            else
                {
                System.out.print(num1 + " " + num3 + " " + num2);
                }
        }
        else if ((num3 > num1 && num3 > num2))
        {
            if(num1 > num2)
            {
                System.out.print(num2 + " " + num1 + " " + num3);
            }
            else
                System.out.print(num1 + " " + num2 + " " + num3);
        }
        else
        {
            System.out.println("ERROR!");
        }

    }

}

