import java.util.Scanner;
public class prog_29 {
    public static void main(String[] args) {
        // Practice set 6
        // Problem no 1
        // float [] a = {23.4f, 56.7f, 78.67f, 687.56f, 78.78f};
        // float b = 0;
        // for(float element : a){
        // b += element;
        // }
        // System.out.println(b);

        // Problem no 2
        // int[] arr = { 1, 2, 3, 4, 6, 7, 8 };
        // int num = 4;
        // boolean isInArray = false;
        // for (int element : arr) {
        //     if (num == element) {
        //         isInArray = true;
        //         break;
        //     }
        // }
        // if(isInArray){
        // System.out.println("The value is present in the array");
        // }
        
     
        // else {
        //     System.out.println("The value is not present in the array");
        // }

        // Problem no 3
        //    Scanner sc = new Scanner(System.in);
        //    System.out.println("How many subject do you have");
        //    int n = sc.nextInt();
        //    int sum = 0;
        //  int [] marks = new int[n];
        //  for(int i = 1; i<=n; i++){
        //     System.out.println("Enter the marks of " + i + " subject");
        //     marks[i] = sc.nextInt();
        //  }
        //  for(int element : marks){
        //     sum = sum + element;
        //  }
        // System.out.println("The average marks is : "+ sum)  ;


        // Problem no 4
      int [][] mat1 = {{1,2,4,6},
                      {1,2,3,4}};
      int [][] mat2 = {{2,1,7,6},
                       {2,5,8,9}};
      int[][] result = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
      // int[][] result = {{0,0,0,0}};
      System.out.println(mat1.length);

  for(int i=0; i<2 ; i++){
    for(int j = 0; j<4; j++){
      result[i][j] = mat1[i][j]+ mat2[i][j];
      System.out.print( result[i][j]+ " ");

    }
    System.out.println(" ");
  }
  // System.out.println(mat1.length);
  // System.out.println(mat2.length);

    }
}
