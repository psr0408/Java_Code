class InvalidInputException extends Exception{
  public String toString(){
    return "Can't add 8 and 9";
  }
  public String getMessage(){
    return "I am getMessage()";
  }
}
class  CannotDivideByZeroException extends Exception{
  public String toString(){
    return "Can't divide by 0";
  }
}
class CustomCalculator{
  double add(double a, double b) throws InvalidInputException{
    if(a==8 || b ==9){
      throw new InvalidInputException();
    }
    return a + b;
  }
  double subtract(double a, double b){
    return a - b;
  }
  double multiply(double a, double b){
    return a * b;
  }
  double divide(double a, double b) throws CannotDivideByZeroException{
    if(b==0){
      throw new CannotDivideByZeroException();
    }
    return a / b;
  }
}
public class prog_103 {
 public static void main(String[] args) throws InvalidInputException ,  CannotDivideByZeroException{
    //  Exercise no 6 Solution
    CustomCalculator c = new CustomCalculator();
    // c.add(8,9);
    c.divide(4, 0);
 }   
}
