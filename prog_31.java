public class prog_31 {
     static int logic(int a, int b) {
        int c;
        if (a > b) {
            c = a + b;
        }

        else {
            c = (a - b) * 5;
        }
        return c;
    }

     int logic1(int a, int b) {
        int c;
        a = 4;
        if (a > b) {
            c = a + b;
        }

        else {
            c = (a + b) * 5;
        }
        return c;
    }

    public static void main(String[] args) {
        // Method in Java
        int t = 45;
        int y = 3;
        int a;
        int b;
        prog_31 obj = new prog_31();
       b = obj.logic1(t,y);
    //    b = logic1(y,t);
        a = logic(t, y);
        System.out.println(a);
        System.out.println(b);

    }
}
