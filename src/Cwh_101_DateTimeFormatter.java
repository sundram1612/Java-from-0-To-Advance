import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cwh_101_DateTimeFormatter {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();    //This is the Date
        System.out.println(ldt+"\n");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");  //This is the format
       // System.out.println(dtf);
        
       String myDate = dtf.format(ldt);    //Creating date String using date and format
       System.out.println(myDate);

       DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE;
       String myDate2 = dtf2.format(ldt);
       System.out.println(myDate2);


    }
}
