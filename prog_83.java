import java.util.Scanner;
import java.lang.*;

class MyException extends Exception {
    @Override
    public String toString() {
        return "I am toString";
        // return super.toString() + "I am toString";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
        // return super.getMessage() "I am getMessage()";
    }
}

public class prog_83 {
    public static void main(String[] args) {
        // The Exception class in java
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a < 9) {
            try {
                System.out.println("hi");
                // throw new MyException();
                throw new ArithmeticException("I am new arithmetic exception");
            } 
            catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                // System.out.println(e);
                // e.printStackTrace();
            }
        }
    }
}
