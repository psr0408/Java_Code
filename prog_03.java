import java.util.*;

public class prog_03 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 1 = byte\n 2 = short\n 4 = int\n 8 = long");
      int c = sc.nextInt();

      int a = c * 8;
      int d = a - 1;
      int b = (int) Math.pow(2, d);
      System.out.printf("The range of %d is : ", c);
      System.out.println(-b + " to " + b);
   }
}


//          int b = (int) Math.pow(2, 5);    2 is denometer and 5 is power

