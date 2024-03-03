import java.util.Scanner;

public class prog_25 {
    public static void main(String[] args) {
        // Practice Question on Loop
        // Problem no 1
        // for(int i = 0; i<5; i++){
        // for(int j = 5; j>i; j--){
        // System.out.print("*");
        // }
        // System.out.println(" ");
        // }

        // Problem no 2
        // int sum = 0;
        // int n = 10;
        // for(int i = 1; i<=n; i++){
        // sum = sum + (2*i);
        // }
        // System.out.println(sum);

        // Problem no 6
        int n = 5;
        int i = 1;
        int factorial = 1;
        while(i<=n){
        factorial *= i;
        i++;

        }
        System.out.println(factorial) ;

        // Problem no 5
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number you want factorial");
        // byte n = sc.nextByte();
        // int factorial = 1;
        // for(int i = 1; i<=n;i++ ){
        // factorial *= i;
        // }
        // System.out.println(factorial);

    }
}
