import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class prog_101 {
    public static void main(String[] args) {
        // DateTimeFormatter in java
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/mm/yyyy--E--a");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate = dt.format(df);
        System.out.println(myDate);
        String myDate1 = dt.format(df2);
        System.out.println(myDate1);
    }
}
