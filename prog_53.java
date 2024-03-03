abstract class Parent2 {
    public void Parent12() {
        System.out.println("I am a constructor of parent 2");
    }
    public Parent2() {
        System.out.println("I am a constructor of parent 2 and 2 ");
    }

    public void sayHello() {
        System.out.println("Hello");
    }
    public void sayHi() {
        System.out.println("Hi");
    }

    abstract public void greet();

    abstract public void greet2();
}

class Child2 extends Parent2 {
    

    @Override
    public void greet() {
        System.out.println("good morning");
    }

    public void greet2() {
        System.out.println("good morning to all");
    }
}

abstract class Child3 extends Parent2 {

    public void th() {
        System.out.println("Hi");
    }
}

class Child4 extends Parent2 {
    @Override
    public void greet() {
        System.out.println("good morning");

    }

    public void greet2() {
        System.out.println("good morning");

    }
}

abstract class Child5 extends Parent2 {
    public void Hi() {
        System.out.println("Hello");
    }
}

public class prog_53 {
    public static void main(String[] args) {
        // Abstract class and abstract method
        // abstract means some thought
        Child2 c = new Child2();
        Child4 c1 = new Child4();
        // c.Parent12();
        // c.greet();
        // c.sayHello();
        // c.sayHi();
        
        // System.out.println(c);
        
        // Child5 c1 = new Child5(); not allowed
        // Child3 c = new Child3(); not allowed
        // Parent2 p = new Parent2(); not allowed

        // System.out.println(c1);
    }
}
