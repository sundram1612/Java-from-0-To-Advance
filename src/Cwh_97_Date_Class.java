import java.util.Date;

public class Cwh_97_Date_Class {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        // System.out.println(Long.MAX_VALUE);
        // System.out.println(System.currentTimeMillis());

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());    // it returns 123 years because it thinks year started from 1900
    }
}
