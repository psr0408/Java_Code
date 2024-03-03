import java.util.Scanner;

public class prog_12 {
    public static void main(String[] args) {
        // // Question no 1
        // float a = 7/4f * 9/2f;
        // System.out.println(a);

        // Question no 2
        // char grade = 'B';
        // grade = (char) (grade + 8);
        // System.out.println(grade);
        // grade = (char) (grade - 8);
        // System.out.println(grade);

        // Question no 3
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int a = sc.nextInt();
        // System.out.println(a>10);

        // Question no 4
        System.out.println("Enter value of v");
        int v = sc.nextInt();
        System.out.println("Enter value of u");
        int u = sc.nextInt();
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of s");
        int s = sc.nextInt();
        // int t = v * v ;
        // int b = u * u;
        // int y = 2*a*s;
        // int i = t - b;
        // float h = i/y;
        float h = ((v * v) - (u * u)) / (2 * a * s);

        System.out.println(h);

    } 
}
