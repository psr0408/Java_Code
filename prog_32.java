public class prog_32 {
    static void change(int a) {
        a = 98;
    }
    static void change2(int [] arr) {
        arr[0] = 98;
        arr[1] = 87;
    }

    static void tellJoke() {
        System.out.println("Good Morning");
    }

    public static void main(String[] args) {
        // tellJoke();
        // we cannot change the integer using function in java as  below follow
        int x = 45;
        change(x);
        System.out.println(x);
        // but we change array value using function
        int[] marks = { 56, 75, 86, 85, 46, 86 };
        change2(marks);
        System.out.println(marks[0]);;
        System.out.println(marks[1]);;
    }
}
