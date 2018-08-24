
package javaapplication2;
import java.io.PrintStream;
public class JavaApplication2 {
    private static String i;
   public static void main(String[] args) {
   /*   N    10*N    100*N      1000*N
        1    10........
        2    20 .......
        3    30  ......
        4    40 ......
        5    50 ......
        */
   System.out.println ("N   10*N     100*N      1000*N      1000*N");
   for (int i=1; i<=5; i++) {
       System.out.println(+i+"   " +10*i+ "     "+100*i+ "      " +1000*i+ "      " +1000*i);
   
    }
    
}
}

