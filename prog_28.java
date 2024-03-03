import java.util.Scanner;
public class prog_28 {
    public static void main(String[] args){
        //  Multidimensional Array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many row you want");
        byte n = sc.nextByte();
        System.out.println("Enter how many column you want");
        byte m = sc.nextByte();
        int [][] std = new int [n][m];

        for(int i = 0; i<n; i++){
            for(int j = 0 ; j<m; j++){
                System.out.println("Enter"+i + j+ " value");
                std[i][j] = sc.nextInt();
            
            }
        }
        System.out.println("The value of row and column is present as it is : ");

        for(int i = 0; i<n; i++){
            for(int j = 0;  j < m; j++){
            // System.out.println("The value of " + i + j + " is :");
            System.out.printf("%d  " , std[i][j]);
        }
        System.out.println(" ");
        }
    
    }
}
