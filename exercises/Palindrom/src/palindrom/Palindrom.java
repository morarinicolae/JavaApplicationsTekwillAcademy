//
package palindrom;

public class Palindrom {

    public static void main(String[] args) {
 /*int palindromNumber =23412;
  
 
  int reversNumber =0;
 for (; palindromNumber > 0; palindromNumber /=10){
     System.out.println(palindromNumber);
    int digit = palindromNumber%10;
reversNumber = reversNumber*10+digit;
System.out.println(" ");
System.out.print(reversNumber);
 }
    }
    
}
*/
int number =12312313;
int reversNumber =0;{
while(number >0){
    reversNumber=reversNumber*10+number%10;
    number /=10;
}
        System.out.println(reversNumber);
    }
    }
}
    


