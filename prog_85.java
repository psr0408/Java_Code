public class prog_85 {
    public static double greet() {
        try {
            int a = 10;
            int b = 3;
            double c = (float)a / b;
            return c;
        }

        catch (Exception e) {
            System.out.print("Error : ");
            System.out.println(e);
        } finally {
            System.out.println("This is end of the program");
        }
        return -1;

    }

    public static void main(String[] args) {
        // Finally block in java
        System.out.println(greet());
        
    }
}
