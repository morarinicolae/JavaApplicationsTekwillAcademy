import java.util.Scanner;

public class Whatever {

 public static void main (String [] args){

  Scanner scan = new Scanner (System.in);

double mex = 62000000;
double usa = 280000000;
double years = 0;

    while(mex <= usa/2) 
    {   
        years++;
    mex = mex * 1.07;
    usa = usa * 1.02;

    }       
    System.out.println ("Mexicos population is half of America in " + years + " years ");
    }     

   }