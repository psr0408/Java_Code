public class prog_33 {
    // static int sum(int a, int b){
    //     return a + b;
    // }
    // static int sum1(int a, int b, int c){
    //     return a + b + c;
    // }
    static int sum(int a,int ...arr){
        int result = a;
       for( int e : arr){
        result += e;
       }
       return result;
    }
    static int sum1(int ...arr){
        int result = 0;
       for( int e : arr){
        result += e;
       }
       return result;
    }
    public static void main(String[] args){
    //    Variable Argument (VarArgs in Java)
    // int a = 4;
    // int  b = 6;
    System.out.println(sum1(3,5,6,8,9,5));
    }
}
