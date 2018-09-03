import java.util.Scanner;
public class Film {
    public static void main (String args[])
{
   
         Scanner keyboard = new Scanner(System.in);
	for(int i=0;i<3;i++){
	 System.out.println("Enter film number (1-3),or 0 to quit");
	 int product = keyboard.nextInt();
	 
	 switch (product){
	   case 1:
	          System.out.println("Iron Man");
                  break;
	   case 2:
	           System.out.println("Iron Man 2");
                  break;
	   case 3:
	         System.out.println("Iron Man 3");
                  break;                         
	   default:
	         System.exit(0);
	 }
        /*System.out.println("Iron Man"); 
        System.out.println("Iron Man 2");
        System.out.println("Iron Man 3");*/
        }
}
}
   


