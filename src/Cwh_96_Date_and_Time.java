public class Cwh_96_Date_and_Time {
    
    /** 
     * @param args
     */
    /*
      Date in Java is stored in the form of a long number . This long number holds the number of
      milisecond passed since 1 jan 1970.
      Java assumes that 1900 is the starting year which means it calculates years passed since 1900
      whenever we ask it for years passed.
      System.currentTimeMillis() returns no. of milliseconds passed.
      Once no of ms are calculated, we can calculate minutes, seconds and years passed.
     */
    public static void main(String[] args) {
      System.out.println(System.currentTimeMillis()/1000/3600/24/365 + " years since 1970");
    }
}
