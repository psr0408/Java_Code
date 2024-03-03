import java.util.Scanner;
public class prog_26_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many student are there");
        int n = sc.nextInt();
        int [] marks = new int [ n];
        for(int i = 1; i<=marks.length; i++){
            System.out.println("Enter marks of " + i + "  student");
             marks[i] = sc.nextInt();
        }
        // for(int j = 1; j<=marks.length; j++){
        //     System.out.println("The marks of " + j + " studnet is " + marks[j]);
        // }
        System.out.println(marks[1]);

    }
}
