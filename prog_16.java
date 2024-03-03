import java.util.Scanner;

public class prog_16 {
    public static void main(String[] args){
        // If else statement is Java
  Scanner sc = new Scanner(System.in);
       System.out.println("Enter your age");
       byte age = sc.nextByte();
      if(age<=10){
           System.out.println("your age is" + age + " you are a child");
      }
      else if(age>=10 && age<18){
        System.out.println("your age is " + age + " you are a teenager");
        System.out.println("You can drive bicycle");
      } 
      else if(age>=18 && age < 65){
         System.out.println("Your age is "  + age  + " you can drive on road");
      }
      else{
        System.out.println("Your age is " +  age + "which is greater than 65 you are a senior citizen");
      }
    }
}
