public class Cwh_24_break {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {

        //Break and continue using loops

//    for(int i=0; i<5; i++)
//    {
//        System.out.println(i);
//        System.out.println("Java is Great!");
//
//        if(i==2){
//            System.out.println("Ending the loop");
//            break;
//        }

        int i=0;
        while (i < 5) {
            System.out.println(i);
            System.out.println("Java is Great!");

            if (i == 2) {
                System.out.println("Ending the loop");
                break;
            }
            i++;
        }
    }
}