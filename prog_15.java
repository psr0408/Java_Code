import java.util.Scanner;

public class prog_15 {
    public static void main(String[] args) {
        // Practice Set no 3
        String name = "Prashant Singh Thakur";
        // Problem no 1
        // System.out.println(name.toLowerCase());

        // Problem no 2
        // System.out.println(name.replace(" ", "_"));

        // Problem no 3
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name");
        // String name1 = sc.nextLine() ;
        // System.out.println("Dear " + name1 + " Thanks a lot");

        // Problem no 3
        // String letter = "Dear <|name|>, Thaanks a lot";
        // letter = letter.replace("<|name|>", "prashant");
        // System.out.println(letter);

        // Problem no 4
        System.out.println("Enter a string");
        String mystring = sc.nextLine();
        System.out.print("The double spaces in the string is started from: ");
        System.out.println(mystring.indexOf(" "));
        System.out.print("The trouble spaces in the string is started from: ");
        System.out.println(mystring.indexOf("  "));

        // Problem no 5
        // String myletter = "Dear <|name|>, This Java Course is Nice, Thanks!";
        // System.out.println("Enter your name");
        // String name45 = sc.nextLine();

        // System.out.println(myletter.replace("<|name|>", name45));
    }
}
