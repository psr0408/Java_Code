class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return  "Radius cannot be negative";
        // return super.toString() + "I am toString";
    }
    public String getMessage(){
        return  "Radius cannot be negative and ";
        // return super.toString() + "I am toString";
    }
    
}
public class prog_84 {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
       double result = Math.PI*r*r;
       return result;
    }
    static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        // Throw vs Throws in Java
    //    try{ int  c = divide(5, 0);
        // System.out.println(c);
        // System.out.println(divide(4, 2));
    // }
    // catch(Exception e){
        // System.out.print("Exception ");
        // System.out.println(e);
    // }
     try{
    double ar = area(-67);
    System.out.println(ar);
     }
     catch(Exception e){
        System.out.println("Exception ");
        System.out.println(e.getMessage());
        System.out.println(e.toString());
     }
}
}
