// package prashant1;
class c1{
   public int x = 5;
   protected int y = 45;
   int z = 6;
   private int a = 56;
   public void meth1(){
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println(a);
   }
}
class c2{

}
public class prog_66 {
    public static void main(String[] args) {
        // Access Modifiers in java
       c1 c = new c1();
       c.meth1();
       System.out.println(c.x);
       System.out.println(c.y);
       System.out.println(c.z);
    //    System.out.println(c.a); we cannot use private in same package


    }
}
