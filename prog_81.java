import java.util.Scanner;

public class prog_81 {
    public static void main(String[] args) {
        // Handling Specific Exception in Java
        int[] marks = { 7, 56, 6 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int a = sc.nextInt();
        System.out.println("Enter the value you want divide");
        int b = sc.nextInt();
        try{
            System.out.println("The value at array index entered is: "+ marks[a]);
            System.out.printf("The value of array value /number is %4.2f",(float)marks[a]/b);
        }
       
        catch(ArrayIndexOutOfBoundsException e){
            System.out.print("ArrayIndexOutOfBoundsException ");
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.print("ArithmeticException ");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.print("Some exception ");
            System.out.println(e);
        }

    }
}
