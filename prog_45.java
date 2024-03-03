class Base{
    public int x ;
    public  void printMe(){
        System.out.println("I am not a constructor");

    }
    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        return x;
    }
}
class Derived extends Base{
       public int y;
       public int getY()
       {
        return y;
       }
       public void setY(int y){
        this.y =  y;
       }
}
public class prog_45 {
    public static void main(String[] args){
        // Inheritance in Java
       Derived a = new Derived();
       a.printMe();
    }
}
