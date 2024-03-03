class Phone {
    public void on() {
        System.out.println("turning on phone");
    }

    public void showTime() {
        System.out.println("Showing time");
    }
}

class Smartphone extends Phone {
    @Override
    public void on() {
        System.out.println("Turning on smartphone");
    }
    public void on(int a) {
        System.out.println("Turning on smartphone in "+ a+" seconds");
    }

    public void music() {
        System.out.println("Playing music");
    }
}

public class prog_49 {
    public static void main(String[] args) {
        // Dynamic Method Dispatch
        // Phone obj = new Phone();
        // obj.on();
        // Smartphone m21 = new Smartphone();
        // m21.on();
        // Phone m23 = new Smartphone(); // phone(reference) superclass hai smartphone(object) subclass hai
        // m23.music(); not allowed
        // m23.showTime();
        // m23.on();
        // Smartphone m34 = new Phone(); not allowed 
        Smartphone m33 = new Smartphone();
        m33.showTime();
        m33.on(3);
        m33.music();

    }
}
