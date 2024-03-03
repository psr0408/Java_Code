import javax.swing.DefaultRowSorter;

class Base1 {
    Base1() {
        System.out.println("I am a constructor of Base1");
    }

    Base1(int a) {
        System.out.println("I am a Overloaded constructor of Base1");
        System.out.println("The value of a is : " + a);
    }

    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1 {
    public int y;

    Derived1() {
        super(4);
        System.out.println("I am a constructor of Derived1");
    }

    Derived1(int a, int b) {
        super(4);
        System.out.println("I am a overloaded constructor of Derived1");

        System.out.println("The value of a : " + a);
        System.out.println("The value of b : " + b);

    }
   

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


 class child extends Derived1{
        child(){
            System.out.println("This is a child class");
        }
        child(int x, int y,int z){
            super(x,y);{
                System.out.println("The value of z is : " +z);
            }
        }
    }
public class prog_46 {
    public static void main(String[] args) {
        // Constructor in Inheritance in Java
        // Base1 b = new Base1();
        // Derived1 d = new Derived1(5, 6);
            child c = new child(3,4,5);
    }
}
