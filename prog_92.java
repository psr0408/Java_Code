import java.util.*;           
public class prog_92 {
    public static void main(String[] args) {
        // Linked List in java demo and method
        //  Open Intellij id
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(0,3);
        l1.add(344);   

        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);

        l2.add(15);
        l2.add(16);
        l2.add(17);
        boolean a = l1.contains(123);
        l1.addAll(2,l2);
        l1.add(6);
        l1.set(1,233);

//        l1.clear();
        System.out.println(a);

        System.out.println(l1.indexOf(15));
        System.out.println(l1.lastIndexOf(6));
        for(int i = 0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
