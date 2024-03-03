public class prog_34 {
   // Recursive approach
    static int factorial(int n){
       if(n==1 || n==0){
        return 1;
       }
       else{
        return n * factorial(n-1);
       }
    }
    public static void main(String[] args){
         // Recursion in Java
         int a = 5;
      System.out.println("The value of factorial " + a + " is : "+ factorial(5));
    }
}
