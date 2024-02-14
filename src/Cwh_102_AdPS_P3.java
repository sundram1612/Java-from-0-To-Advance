import java.util.Calendar;



public class Cwh_102_AdPS_P3 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+ c.get(Calendar.MINUTE)+":"+ c.get(Calendar.SECOND));
    }

}
