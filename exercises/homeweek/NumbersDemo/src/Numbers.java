import java.util.Scanner;
public class Numbers {
 
    public static void main(String[] args) {
        int valOne = 20;
        int valTwo = 37;
         
        Numbers num = new Numbers();
        num.sum(valOne, valTwo);
        num.difference(valOne, valTwo);
    }
     
    private void sum(int i, int j) {
        System.out.println("Sum of " + i + " and " + j + " = " + (i + j));
    }
     
    private void difference(int i, int j) {
        int diff = 0;
        if(i >= j) {
            diff = i - j;
        }
        else {
            diff = j - i;
        }
        System.out.println("Difference of " + i + " and " + j + " = " + diff);
    }
 
}