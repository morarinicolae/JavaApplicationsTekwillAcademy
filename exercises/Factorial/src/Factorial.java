
 public class Factorial {
  public static void main(String[] args) {
    long limit = 20;
    long factorial = 1;
    for (int i = 1; i <= limit; i++) {
      factorial = 1; // Initialize factorial
      int j = 2;
      while (j <= i)
        factorial *= j++;
      System.out.println(i + "!" + " is " + factorial);
    }
  }
} 

