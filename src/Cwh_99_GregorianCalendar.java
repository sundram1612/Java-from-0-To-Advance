import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Cwh_99_GregorianCalendar {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Calendar ca = Calendar.getInstance();
        System.out.println(ca.getTime());
        System.out.println(ca.get(Calendar.DATE));
        System.out.println(ca.get(Calendar.HOUR));
        System.out.println(ca.get(Calendar.HOUR_OF_DAY)+":"+ca.get(Calendar.MINUTE)+":"+ca.get(Calendar.SECOND));
        GregorianCalendar Gc = new GregorianCalendar();
        System.out.println(Gc.isLeapYear(1900) +"\n");

        /*
         Time Zone- Time zone is used to create time zone in Java. some of the important methods of 
         TimeZone Class are:

         */
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}
