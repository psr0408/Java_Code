public class prog_32_01 {
    static void foo(){
        System.out.println("Good Morning");
    }
    static void foo(int a){ // a is parameter 
        System.out.println("Good Morning " + a );
    }
    public static void main(String[] args){
        // Method Overloading
       foo();
       int a = 3000; // 3000 is argument - argument are actual
       foo(a);
    //    
    }
}
