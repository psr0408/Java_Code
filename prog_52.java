// intellij id check kr lo
class Circle{
    public int radius;
    Circle(int r)

    {
        System.out.println("I am circle parameterized construstor");
        this. radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    Cylinder(int r, int h){
   super(r);
   System.out.println("I am cylinder constructor");
   this.height = h;
    }
    public int height;
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class prog_52 {
    public static void main(String[] args){
        // Problem no 1
        // Circle obj = new Circle(4);
        // double a = obj.area();
        // System.out.println(a);
        Cylinder obj = new Cylinder(12,4);
        System.out.println(obj.volume());

        // Problem no 2


    }
}
