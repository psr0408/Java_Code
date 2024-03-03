public class prog_29_01 {
    public static void main(String[] args) {
        // Problem no 5
        // Reverse an array
        // int [] array = {123,43,546,75,75,46};
        // int a = Math.floorDiv(array.length, 2);
        // int temp;
        // int l = array.length;
        // for(int i =0; i<a; i++){
        // temp = array[i];
        // array[i] = array[l-i-1] ;
        // array[l-i-1] = temp;
        // }
        // for(int element : array){
        // System.out.print(element+" ");
        // }

        // Problem no 6
        // Find an maximum number in an array
        // int [] array = {123,43,546,75,75,46};
        // int max = Integer.MIN_VALUE;
        // for(int e : array){
        // if(e>max){
        // max = e;
        // }

        // }
        // System.out.println(max);

        // Problem no 7
        // Find an minimum number in an array

        // int [] array = {123,43,546,75,75,46};
        // int min = Integer.MAX_VALUE;
        // for(int e : array){
        // if(e<min){
        // min = e;
        // }

        // }
        // System.out.println("The minimum value in the array is : " + min);

        // Problem no 8
        // int[] arr1 = { 1, 2, 5, 3, 5, 4 };
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        boolean isSorted = true;
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
                // System.out.println(isSorted);

            }

        }

        // System.out.println(isSorted);
        if (isSorted) {
            System.out.println("The array is Sorted");
        } else {
            System.out.println("The array is not Sorted");
        }

    }

}
