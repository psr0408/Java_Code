public class prog_34_01 {
    // Iterative approach
    public static void main(String[] args) {
        int n = 5;
        
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
