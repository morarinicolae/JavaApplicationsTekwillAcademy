


//public class Eggs {

    //public static void main(String[] args) {
        
        ///}
    
//2
//}

import java.util.*; 
class EggsINITS 
{ 
public static void main(String[] args) 
{ 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter the no. of eggs taken."); 
int no=sc.nextInt(); 
int doz=no/12, unit=no-doz*12; 
System.out.println("you ordered"+no+" eggs. That's "+doz+" dozens plus "+unit+" eggs. That's $"+(doz*2.75+unit*0.35)); 
} 
}