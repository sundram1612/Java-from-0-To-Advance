import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cwh_102_AdPS_P4 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
         LocalDateTime ldt = LocalDateTime.now();    //This is the Date
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:m:s"); //This is the format
         String myDate2 = dtf.format(ldt);
         System.out.println(myDate2);
    }
}
