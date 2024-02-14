public class Cwh_86_Ps14_P2 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        try{
            int a = 666/0;

        }
        catch(IllegalArgumentException e){
            System.out.println("HAHAA...!");
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println("HEHE...!");
            System.out.println(e);
        }
    }    
}
