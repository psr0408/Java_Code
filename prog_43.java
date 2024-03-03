import java.util.Random;
import java.util.Scanner;

class Game {
    public Game() {
        int a;
        int b;
        boolean input = true;
        int noOfGuesse = 0;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        a = rand.nextInt(1, 100);
        // System.out.println(a);
        System.out.println("Enter the number");
        // b = sc.nextInt();

        while (input) {
            noOfGuesse++;
            b = sc.nextInt();
            if (a == b) {
                System.out.print("You guess right " + a + ", ");
                System.out.println("You got it in " + noOfGuesse + " attemps");
                input = false;
            } else if (a > b) {
                System.out.println("Your number is less than computer number");

            } else if (a < b) {
                System.out.println("Your number is greater than computer number");
            }
        }
        sc.close();
    }
}

public class prog_43 {
    public static void main(String[] args) {
        // Guess the number game in Java
        Game g = new Game();
        // g();
        System.out.println(g);
    }
}
