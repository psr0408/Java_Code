import java.util.Scanner;
public class prog_06 {
    public static void main(String[] args){
        // Exercise no 1
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the marks of first subject");
    int a = sc.nextInt();
    System.out.println("Enter the marks of second subject");
    int b = sc.nextInt();
    System.out.println("Enter the marks of third subject");
    int c = sc.nextInt();
    System.out.println("Enter the marks of fourth subject");
    int d = sc.nextInt();
    System.out.println("Enter the marks of fifth subject");
    int e = sc.nextInt();
    int marks = a  + b  + c + d + e;
    float result = marks/5f;
    System.out.println("The percentage of this result is : " + result);
    }
}
