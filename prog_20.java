import java.util.Scanner;
import java.util.Random;

public class prog_20 {
    public static void main(String[] args) {
        boolean a = true;
        while(a){
        // Rock, Paper, Scissors Game
        Random rand = new Random();
        int num = rand.nextInt(1, 4);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice..");
        System.out.println("1. Rock\n2. Paper\n3. Scissor");
        byte choice = sc.nextByte();
        if (choice > 4 || choice == 0) {
            System.out.println("Invalid Choice");
        } else if (choice == 1 && num == 1 || choice == 2 && num == 2 || choice == 3 && num == 3) {
            System.out.println("Draw match");
        } else if (choice == 1 && num == 3 || choice == 2 && num == 1 || choice == 3 && num == 2) {
            System.out.println("You win");

        } else {
            System.out.println("You Loose");

        }
        System.out.print("Computer choice is : ");
        if (num == 1) {
            System.out.println("Rock");
        } else if (num == 2) {
            System.out.println("Paper");
        } else {
            System.out.println("Scissor");
        }
        System.out.print("your choice is : ");
        if (choice == 1) {
            System.out.println("Rock");
        } else if (choice == 2) {
            System.out.println("Paper");
        } else {
            System.out.println("Scissor");
        }
    }
}
}