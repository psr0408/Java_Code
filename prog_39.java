class Employee1 {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

}

 class CellPhone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("vibrating...");
    }
 }
 class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
         return 4*side;
    }
 }
 class Rectangle{
    int length;
    int width;
    public int length(){
        return length * width;
    }
    public int perimeter(){
        return 2*(length+width);
    }

 }
 class Tommy{
    public void hit(){
        System.out.println("Hitting..");
    }
    public void run(){
        System.out.println("Running..");
    }
    public void fire(){
        System.out.println("Firing..");
    }
 }
public class prog_39 {
    public static void main(String[] args) {
        // Practice set Chapter 8
        // Problem no 1
        Employee1 prashant = new Employee1();
        prashant.setName("Prashant");
        prashant.salary = 34000;
        // System.out.println(prashant.getName());
        // System.out.println(prashant.getSalary());

        // Problem no 2
        // CellPhone r1 = new CellPhone();
        // r1.ringing();
        // r1.vibrating();

        //  Problem no 3
        //  square sq = new square();
        //  sq.side = 3;
        //  System.out.println(sq.area());
        //  System.out.println(sq.perimeter());
   

        //   Problem no 4
        Rectangle s1 = new Rectangle();
        s1.length= 4;
        s1.width = 5;
        System.out.println(s1.length());
        System.out.println(s1.perimeter());



        // Problem no 5
        Tommy gamer = new Tommy();
        // gamer.fire();
        // gamer.run();
        // gamer.hit();


    }
}
