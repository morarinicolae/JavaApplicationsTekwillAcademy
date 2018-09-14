/*
3.	Write a program for Horizon Phones, a provider of cellular phone service. 
Prompt a user for maximum monthly values for talk minutes used, text messages sent,
and gigabytes of data used, and then recommend the best plan for the customer’s needs.
A customer who needs fewer than 500 minutes of talk and no text or data should accept Plan A at $49 per month. 
A customer who needs fewer than 500 minutes of talk and any text messages should accept Plan B at $55 per month.
A customer who needs 500 or more minutes of talk and no data should accept 
either Plan C for up to 100 text messages at $61 per month or Plan D for 100 text
messages or more at $70 per month. A customer who needs any data should accept 
Plan E for up to 2 gigabytes at $79 or Plan F for 2 gigabytes or more at $87
*/
//public class Phone {
    import java.util.Scanner;

public class Phone
{
  
  public static void main(String[] args)
  {
    int minutes, gigsOfData, messages;
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Please enter the number of minutes you plan to use.");
    minutes = keyboard.nextInt();
    
    System.out.println("Please enter your planned data usage in whole numbers, assume Gigabyte as the unit");
    gigsOfData = keyboard.nextInt();
    
    System.out.println("Please enter your planned number of text messages");
    messages = keyboard.nextInt();
    
    if (minutes <=500 && gigsOfData == 0)//A 
  {
     if (messages == 0) 
    System.out.println("Plan A is appropiate for you at $49 per month");
   }
    if (minutes <= 500 && messages > 100)//B
  {
    if (gigsOfData == 0) 
      System.out.println("Plan B is right for you at $55 permonth");
   }
    if (minutes >= 500 && messages <= 100)//C 
    System.out.println("Plan C is right for you at $70");
    if (gigsOfData > 0 && gigsOfData <2 )//E
      System.out.println("Plan E is right for you at $79 per month");
    if (gigsOfData >= 2 )//f 
      System.out.println("Plan F is right for you at $87 per month");
}
}
