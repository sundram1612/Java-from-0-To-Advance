public class Cwh_24_continue {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is Great!");
        }
    }
}