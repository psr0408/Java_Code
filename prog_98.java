import java.util.Calendar;
import java.util.TimeZone;
public class prog_98 {
    public static void main(String[] args) {
        // Calender class in java
        Calendar c =  Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        Calendar c1 =  Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c1.getCalendarType());
        System.out.println(c1.getTimeZone().getID());
        System.out.println(c1.getTimeZone());

    }
}
