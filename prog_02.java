public class prog_02 {
    public static void main(String[] args){
        System.out.println("Star Pattern ");
     for(int i = 0; i<5; i++){
        for(int j = 0; j<=i; j++){
            System.out.printf("*");
        }
        System.out.println( );
     }
     System.out.println("Reverse Star Pattern ");
     for(int i = 0 ; i<5; i++){
        for(int j = 5 ; j>i ; j--){
            System.out.printf("*");
        }
        System.out.println();
     }
    }
}
