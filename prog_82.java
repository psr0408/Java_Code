import java.util.Scanner;

public class prog_82 {
    public static void main(String[] args) {
        // Nested Try-Catch in java
        int[] marks = { 56, 76, 76, 56, 46, 76 };
        Scanner sc = new Scanner(System.in);
        boolean ab = true;
        while(ab){
            System.out.println("Enter the value of index");
            int a = sc.nextInt();
        try {
            System.out.println("Welcome sir");
            try {
                System.out.println(marks[a]);
                ab = false;
            }
            
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Sorry this index does not exist");
                System.out.println("Exception in level 2");
                
                // System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println("Exception in level 1");

            System.out.println(e);
        }
    }
}
}
