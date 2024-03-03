
import java.util.*;
public class prog_91 {

    public static void main(String[] args) {
        //  ArrayList in java method
        //  Open Intellij id
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);

        l1.add(6);
        l1.add(7);
        l1.add(8);
        // l1.add(0,3);

        l2.add(11);
        l2.add(12);    
        l2.add(13);
        l2.add(14);
        l2.add(233);
        l2.add(15);
        l2.add(16);
        l2.add(17);

        boolean a = l1.contains(6);
        l1.addAll(2,l2);
      
        boolean a1 = l1.contains(14);
        l1.add(6);
        l1.add(1,233);

//        l1.clear();
        System.out.println(a);
        System.out.println(a1);

        System.out.println(l1.indexOf(15));
        System.out.println(l1.lastIndexOf(233));
        System.out.println(l1.indexOf(233));
        for(int i = 0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

    }
}