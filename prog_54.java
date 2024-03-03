interface Bicycle{
   public void applyBreak(int decrement);
    void speedUp(int increment);
    void speedLow(int increment);
}
class AvonCycle implements Bicycle{
    int speed = 7;
    public void applyBreak(int decrement){
        speed -= decrement;
        // speed = speed - decrement;
    }
    public void speedUp(int increment){
        speed += increment;
        // speed = speed - increment;
    }
    @Override
    public void speedLow(int increment) {
        System.out.println("Speed slow");
    }
}
public class prog_54 {
    public static void main(String[] args){
    //  Introduction to Interfaces
    AvonCycle av = new AvonCycle();
    // av.applyBreak(5);
    Bicycle b = new AvonCycle();
    b.applyBreak(5);
    b.speedLow(6);
    
   

    }
}
