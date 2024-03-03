import java.util.Scanner;

public class prog_86 {
    public static void main(String[] args) {
        // Practice question on error exception
        // Problem no 2
        // try{
        // int a = 6;
        // int b = 9;
        // int c = a/b;
        // System.out.println(c);
        // }
        // catch(IllegalArgumentException e){
        // System.out.println("Errorr");
        // }
        // catch(ArithmeticException e){
        // System.out.println("Arithmetic error");
        // }

        // Problem no 3
        boolean flag = true;
        while (flag) {
            int[] marks = { 45, 75, 86 };
            int i = 0;
            Scanner sc = new Scanner(System.in);
            int index;
            while (flag && i <4) {
                try {
                    System.out.println("Enter the value of index");
                    index = sc.nextInt();
                    System.out.println("The value marks is : " + marks[index]);
                    // break;
                    
                } catch (Exception e) {
                    System.out.println("Invalid index");
                    // System.out.println(i);

                    i++;
                    if(i==4){
                        flag = false;
                    }
                   
                }
            }
        }

    }
}