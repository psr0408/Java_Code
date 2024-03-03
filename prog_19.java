import java.util.Scanner;
public class prog_19 {
    public static void main(String[] args){
        // Practice Set no 4

        // Problem no 1
        // int a = 10;
        // if(a==11){
        //     System.out.println("I am 11");
        // }
        // else{
        //     System.out.println("I am not 11");
        // }

        // Problem no 2
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your marks of first subject");
        // byte marks1 = sc.nextByte();
        // System.out.println("Enter your marks of second subject");
        // byte marks2 = sc.nextByte();
        // System.out.println("Enter your marks of third subject");
        // byte marks3 = sc.nextByte();
        // float total_marks = (marks1  + marks2 + marks3)/3f;
        // if(total_marks>=40 && marks1>=33 && marks2>=33 && marks3>=33){
        //     System.out.println("Congrulations, you are pass  and your percentage is : "+ total_marks);

        // }
        // else{
        //     System.out.println("You are fail in exam");
       

        // Problem no 3
    //    System.out.println("Enter your salary");
    //    int salary = sc.nextInt();
    //    System.out.println("Your salary is : " +  salary);
    //    int salary1 = salary/20;
    //    int salary2 = salary/5;
    //    int salary3_1 = salary/10;
    //    int salary3 = salary3_1*3;
    //    if(salary<250000){
    //     System.out.println("You are not eligible to pay tax");
    //    }
    //    else if(salary>=250000 && salary<500000){
    //     System.out.println("Your  payable tax is :" + salary1);

    //    }
    //    else if(salary>=500000 && salary<1000000){
    //            System.out.println("Your  payable tax is :" + salary2);

    //    }
    //    else if(salary>=1000000){
    //            System.out.println("Your  payable tax is :" + salary3);

    //    }


    // Problem no 4
    System.out.println("Enter website name");
    String web = sc.nextLine();
    if(web.endsWith(".com")){
  System.out.println("This is a commerical website");
    }
    if(web.endsWith(".org")){
  System.out.println("This is a organiztional website");
    }
    if(web.endsWith(".in")){
        System.out.println("This is a Indian website");
    }
    }
}
