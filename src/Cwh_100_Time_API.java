import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Cwh_100_Time_API {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        System.out.println("\n");
        
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        System.out.println("\n");

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
    }    
}
