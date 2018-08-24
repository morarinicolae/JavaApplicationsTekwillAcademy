
import java.util.Scanner;
public class Sales { 
    public static void main (String args[]) {
 double total=0.0;
	Scanner keyboard = new Scanner(System.in);
	for(int i=0;i<5;i++){
	 System.out.println("Enter product number (1-5),or -1 to quit");
	 int product = keyboard.nextInt();
	 double price = 0;
	 switch (product){
	   case 1:
	          price = 2.98;
                  break;
	   case 2:
	          price = 4.5;
                  break;
	   case 3:
	          price = 9.98;
                  break;
           case 4:
	          price = 4.49;
                  break;
	   case 5:
	          price = 6.87;
                  break;                          
	   default:
	         System.exit(0);
	 }
	 System.out.println("Enter number of quantities sold:");
	 int quantity = keyboard.nextInt();
	 total += price * quantity;
                System.out.println(total);
	System.out.println("Total income :" + total +" $ ");}
    }
}