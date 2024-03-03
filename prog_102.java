import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;

import javax.print.DocFlavor.STRING;

public class prog_102 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Advanced Java Practice
        // Problem no 1
        // Open intellij id
        @SuppressWarnings("rawtypes")
        ArrayList ar = new ArrayList();
        // ArrayList<STRING> ar = new ArrayList<>();
        // ar.add("Student 1");
        // ar.add("Student 2");
        // ar.add("Student 3");
        // ar.add("Student 4");
        // for(Object o : ar){
        // System.out.println(o);
        // }

        // Problem no 5
        // HashSet<Integer> s = new HashSet();
        // s.add(4);
        // s.add(5);
        // s.add(4);
        // System.out.println(s);

        // Problem no 2
        // Date d = new Date(0, 0, 0);
        // System.out.println(d.getHours() + d.getMinutes() + d.getSeconds());
        // Date d1 = new Date(0);
        // System.out.println(d1.getHours() +":" +d1.getMinutes() +":"+
        // d1.getSeconds());

        // Problem no 3
        // Calendar c = Calendar.getInstance();
        // System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        // Problem no 4
        LocalDateTime lt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/mm/yyyy--h:m:s");
        String mydate = lt.format(df);
        System.out.println(lt);
        System.out.println(df);
        System.out.println(mydate);

    }
}
