//  intellij id
interface Bicycle {
    int a =45;
    void applyBreak(int decrement);

    void speedUp(int increment);

}
interface HornBicycle{
    void blowHornK3g();
    void blowHorn123();
    }


class AvonCycle implements Bicycle, HornBicycle {
    int speed = 7;
    void blowHorn(){
        System.out.println("Oee Oeo");
    }

    public void applyBreak(int decrement) {
        System.out.println("Apply break");
        speed -= decrement;
        // speed = speed - decrement;
    }

    public void speedUp(int increment) {
        System.out.println("speed up");
        speed += increment;
        // speed = speed - increment;
    }
    public void blowHornK3g(){
        System.out.println("Horn horn");
    }
    public void blowHorn123(){
        System.out.println("hon 123");
    }
}

public class prog_55 {
    public static void main(String[] args) {
        // Abstract Class vs Interfaces
        AvonCycle cycle1 = new AvonCycle();
        cycle1.applyBreak(1);
        System.out.println(cycle1.a);
        // cycle1.blowHornK3g();
        // cycle1.blowHorn123();
        
    }
}
