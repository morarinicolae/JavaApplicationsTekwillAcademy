/*
public class HomeWork5 {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
*/
import java.util.Scanner;

class CarlysEventrice
{
   public static void main(String[] args)
   {
      
      String str = "Carly's makes the food that makes it a party";
      displayString(str);
      //displayCost();
      
   }//end main
   
   public static void displayString(String carlysMotto)
   {
      int yAxis = 1;
      String display = "";
      
      int len = carlysMotto.length();
      len += 6;

      
     while (yAxis <= 7)      
     {
         //adds carlys company motto in the middle of box
         if (yAxis == 4)
         {
            display += "\n*" + " " + " " + carlysMotto + " " + " " + "*";
            yAxis++;
            continue;
         
         }//end if statement       
         
         //adds asterisks at first and last line
         else if (yAxis == 1 || yAxis == 7)
         {
            
            if (yAxis == 7)
            {
               display += "\n";
            }//end if statement
           
            
            for (int i = 0; i < len; i++)
            {
               display += "*";
               
            }//end for loop
            
                         
         }//end else if statement
         
         //adds asterisk at beginign and end of box. Then adds spaces in middle of box
         else 
         {
            display += "\n";
            
            
            for (int i = 0; i < len; i++)
            {
               if (i == 0 || i == len - 1)
               {
                  display += "*";
               
               }//end if statement
               
               else
               {
                  display += " ";
               
               }//end else statement   
            
            }//end for loop
           
         
         }//end else statement
         
          yAxis++;
         
         
       }//end while loop
      
      System.out.println(display);
   }
}