/*Write a class that calculates and displays the conversion of an entered 
number of dollars into currency denominations—20s, 10s, 5s, and 1s.*/
import java.util.Scanner;

public class Dollars

{

    public static void main(String[] args)

    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of dollars: ");
        double current = scan.nextDouble();
        int total20 = 0;
        int total10 = 0;
        int total5 = 0;
        int total1 = 0;        
        double check20 = current/20;
        if(check20 > 0)

        {
            total20 = (int) check20;

            if(check20 % 20 != 0)
            {
                current = 20*(check20-total20);
            }
            else
            {
                current -= (total20*20);
            }
        }       
        double check10 = current/10;
        if(check10 > 0)
        {
            total10 = (int) check10;
            if(check10 % 10 != 0)
            {
                current = 10*(check10-total10);
           }
            else
            {
                current -= (total10*10);
            }
        }
        double check5 = current/5;
        if(check5 > 0)
        {
            total5 = (int) check5;
           if(check5 % 5 != 0)
            {
                current = 5*(check5-total5);
            }
            else
            {
                current -= (total5*5);
            }
        }
        double check1 = current/1;
        if(check1 > 0)
        {
            total1 = (int) Math.round(check1);
        }
        System.out.println("20s: "+total20);
        System.out.println("10s: "+total10);
        System.out.println("5s: "+total5);
        System.out.println("1s: "+total1);
    }

}