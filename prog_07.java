import java.util.Scanner;
public class prog_07 {

    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // Practice Set 1
        // Question no 1
        // System.out.println("Enter first subject marks");
        // int a = sc.nextInt();
        // System.out.println("Enter second subject marks");
        // int b = sc.nextInt();
        // System.out.println("Enter third subject marks");
        // int c = sc.nextInt();
        // int d = a  + b + c;
        // float e = d/30f;
        // System.out.println("The CGPA is : " + e);
   
        // Question no 3
        // System.out.println("Enter your name");
        // String name = sc.nextLine();
        // System.out.println("Hello " +  name  + " have a good day");
        
        // Question no 4
        // System.out.println("Enter the value of kilometer");
        // float a = sc.nextFloat();
        // float b = a*0.621f;
        // System.out.println("The "+ a + " kilometer in miles is : " + b);
        
        // Question no 5
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
       boolean t = sc.hasNextInt();
       System.out.println(t);
       if(t==true){

           System.out.println("The entered value is integer");
       }
       else{
        System.out.println("The value is not integer");
       }
    }
}
