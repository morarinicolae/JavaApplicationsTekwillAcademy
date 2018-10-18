
package birthdayreminder;


import java.util.Scanner;
public class BirthdayReminder {


    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       String[] arrayOfNames=new String[2];
       String[] arrayOfBirthdays=new String[2];
       int counterOfNames=0,counterOfFoundNames=0;
       String nameToBeChecked=null;
       
       
           for(int i=0;i<arrayOfNames.length;i++){
               System.out.println("Please type  "+(i+1)+" person name:");
               arrayOfNames[i]=scan.nextLine();
               if("ZZZ".equals(arrayOfNames[i])) break;
               System.out.println("Please type  "+(i+1)+" person birthday:");
               arrayOfBirthdays[i]=scan.nextLine();
               counterOfNames++;
           }
           
           System.out.println(counterOfNames+" names were entered.");
           /*for(int i=0;i<arrayOfNames.length;i++){
               System.out.println(arrayOfNames[i]+" "+arrayOfBirthdays[i]);
           }*/
           
           
           System.out.println("Please enter a name :");
               nameToBeChecked=scan.nextLine();
           
           while(!"ZZZ".equals(nameToBeChecked)) {
               counterOfFoundNames=0;
           for(int i=0;i<arrayOfNames.length;i++){
            if(nameToBeChecked.equals(arrayOfNames[i])) {System.out.println("Name:"+arrayOfNames[i]+
                    ", birthday day: "+arrayOfBirthdays[i]); counterOfFoundNames++;}
           }
                if(counterOfFoundNames==0) System.out.println("The name was not found.");
                
               System.out.println("Please enter another name to be checked:");
               nameToBeChecked=scan.nextLine();
           }
           
           
       
       
           
    }
    
}