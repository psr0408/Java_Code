class A{
    public int a;
    public int prashant(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    
    public void meth2(int a){
        System.out.println("I am method 2 of class B");
        System.out.println("The value of a is : " + a);
    }
    @Override
   public void meth2(){
        System.out.println("I am method 2 of class B");
        // System.out.println("The value of a is : " + a);
    }
   public void meth21(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class prog_48 {
    public static void main(String[] args){
        // Method overriding in Java
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
    }
}
