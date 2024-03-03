public class prog_23 {
    public static void main(String[] args){
        // for loop 
        //  Star Pattern 
        for(int i = 0; i<5; i++){
          for(int j = 0; j<=i; j++){
            System.out.print("*");
          }
          System.out.println(" ");
        }
        // Reverse Star Pattern 
        System.out.println("\n \n \n");
        for(int i = 0; i<5; i++){
            for(int j = 5; j>i; j--){
                            System.out.print("*");

            }
                      System.out.println(" ");

        }
    }
}
