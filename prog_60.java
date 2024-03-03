abstract class Pen {
    abstract void write();

    abstract void refill();
}


class FountainPen extends Pen {
    void write() {
        System.out.println("Write");

    }

    void refill() {
        System.out.println("Refill");
    }

    void changeNib() {
        System.out.println("Changing the nib");
    }
}

class Monkey {
    void jump() {
        System.out.println("Jumping");
    }

    void bite() {
        System.out.println("Bitting");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();

}

class Human extends Monkey implements BasicAnimal {
    void speak() {
        System.out.println("Hello");
    }

    public void eat() {
        System.out.println("Eating");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }
}

public class prog_60 {
    public static void main(String[] args) {
        // Practice question on abstract classes interfaces
        // Problem no 1 and 2
        // FountainPen pen = new FountainPen();
        // pen.changeNib();

        // Problem no 3
        // Human h = new Human();
        // h.sleep();

        // Problem no 5
        // Monkey m1 = new Human(); // using polymorphism
        // m1.jump();
        // m1.bite();

        // BasicAnimal b = new Human();
        // b.eat();

        s p = new s();
        p.name();
        
    }
}
