interface AClass {
    void meth1();

    void meth2();
}

@FunctionalInterface
interface BClass {
    void meth1(int a);
}

public class prog_109 {
    public static void main(String[] args) {
        // Anonymous class
        AClass ac = new AClass() {
            public void meth1() {
                System.out.println("I am meth1");
            }

            public void meth2() {
                System.out.println("I am meth2");
            }
        };
        ac.meth1();

        // Lambda expression
        BClass bc = (a) -> {
            System.out.println("This is method 1 " + a);
        };
        bc.meth1(8);
    }
}
