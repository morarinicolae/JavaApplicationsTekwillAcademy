package laborator2;
public class Laborator2 {
    public static void main(String[] args) {
       //Ex: 1 
        /*int x=24;
        String Y="\"sir de caractere\"";
        System.out.println(x + " iesirea sarcinii = " + Y);*/
        
//Ex : 2
       /* int result = 1 + 2;
        final int y;// am declarat o constanta
      y= -5;
        System.out.println("1 + 2 = " + result);
        int original_result = result;
        System.out.println(-y);
        //result = result - 1;
        //System.out.println(original_result + " - 1 = " + result);
        //original_result = result;

       //result = result * 2;
        //System.out.println(original_result + " * 2 = " + result);
        //original_result = result;

        //result = result / 2;
       // System.out.println(original_result + " / 2 = " + result);
        //original_result = result;

        result = ++ result;
        System.out.println("Increment " + original_result + " ++ " + " = " +  result);
        original_result = result; 
        
        result = -- result;
        System.out.println("Decrement " + original_result + " -- " + " = "+ result);
        original_result = result; 

        //result = result + 8;
        //System.out.println(original_result + " + 8 = " + result);
        //original_result = result;

        //result = result % 7;  
        //System.out.println(original_result + " % 7 = " + result);
       
       */
       
       //Ex:  3
       /*
    System.out.println("Integer Min = " + Integer.MIN_VALUE);
    System.out.println("Integer Max = " + Integer.MAX_VALUE);
    System.out.println("Integer Min = " + Float.MIN_VALUE);
    System.out.println("Integer Max = " + Float.MAX_VALUE);
    System.out.println("Integer Min = " + Long.MIN_VALUE);
    System.out.println("Integer Max = " + Long.MIN_VALUE);
    System.out.println("Integer Min = " + Double.MIN_VALUE);
    System.out.println("Integer Max = " + Double.MAX_VALUE);
*/
     // boolean b1 = true;
		
		//boolean b=(10>9)?true:false;
		//System.out.println("10>9 is "+b);
                boolean x,y;
                System.out.println("sau \t true \tfalse");
                x= true;
                y= true;
                System.out.println("true\t "+ (x||y) + "\t" + (x||!y));
                System.out.println("false\t " +(!x||y)+ "\t" + (!x||!y) );

    }
    
}
