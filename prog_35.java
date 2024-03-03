public class prog_35 {
    // Problem no 1
    static void multi_table(int n) {
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }
    }

    // Problem no 2
    static void star_pattern(int a) {
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
    // Problem no 3

    static int sum_rec(int n) {
        if (n == 1) {
            return 1;
        }

        return n + sum_rec(n - 1);

    }

    // Problem no 4
    static void rev_star(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }

    // Problem no 5
    static int fib(int n) {
        // if(n==1){
        // return 0;
        // }
        // else if(n==2){
        // return 1;
        // }
        if (n == 2 || n == 1) {
            return n - 1;

        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    // Problem no 6
    static int avg(int... arr) {
        int a = 0;
        for (int e : arr) {
            a += e;
        }
        return a / arr.length;
    }

    // Problem no 7
    static void pattern_rec(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            pattern_rec(n - 1);
            System.out.println("");
        }
    }


    //  Problem no 8
    static void pattern_rec_1(int n) {
        if (n > 0) {
            pattern_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    // Problem no 10
     static int sum_itr(int n){
        if(n==1){
            return 1;
        }
        else{
            int a = 0;
            for(int i=0; i<=n; i++){
                // for(int e:  i){
                  a += i;
                }
                return a;
            }
        }
    //  }
    public static void main(String[] args) {
        // int a =5;
        // multi_table(5);
        // // star_pattern(5);
        // int c = sum_rec(4);
        // System.out.println(c);
        // rev_star(5);
        // System.out.println( fib(7));
        // System.out.println(avg(5,6,7));
        // pattern_rec(5);
        // pattern_rec_1(5);
       System.out.println(sum_itr(5));
        
}
}
