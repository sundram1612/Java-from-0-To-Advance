import java.util.Calendar;
import java.util.TimeZone;

public class Cwh_98_CalendarClass {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        // Calendar class is an abstract class
        // Calendar c = Calendar.getInstance();
        // System.out.println(c.getCalendarType());
        // System.out.println(c.getTimeZone());

         Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
    }
}
