import java.lang.reflect.Array;
import java.util.ArrayDeque;

@SuppressWarnings("unused")
public class prog_93 {
 public static void main(String[] args) {
    // Array Deque in java
   ArrayDeque<Integer> ad1 = new ArrayDeque<>() ;
   ad1.add(4);
   ad1.add(34);
   ad1.addFirst(45);
   ad1.add(19);
   System.out.println(ad1.getFirst());
   System.out.println(ad1.getLast());
   System.out.println(ad1);
 }   
}
