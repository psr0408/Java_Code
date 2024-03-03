import java.util.Random;
import java.util.Scanner;
//  code sahi hai bas vs code me dikkat hai 
//  intellij id me chal raha hai please check there
class Game {
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int n) {
        this.noOfGuesses = n;
    }

    Game() {
        Random rand = new Random();
        int number = rand.nextInt(1, 100);

    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.println ("You got correct ");
            System.out.printf("You got in %d attemp", noOfGuesses);
            return true;
        }
        else if (inputNumber > number) {
            System.out.println("too high");

        }
        else if (inputNumber < number) {
            System.out.println("too less");

        }

        return false;

    }

    void takeUserInput() {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();

    }
}

public class prog_50{
    public static void main(String[] args) {
        // Exercise no 3 Random Number Guessing Game
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }
    }
}
