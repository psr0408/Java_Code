import java.util.Scanner;
public class prog_18 {
    public static void main(String[] args){
        // Switch case statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 100");
        byte num = sc.nextByte();
        switch(num){
            case 1:
            System.out.println("The value is one");
            break;
            default:
            System.out.println("The number you entered is : " + num);
        }

    }
}
