/*
    Finally Block -> Finally block contains the code which is always executed whether the exception is handled or not.
                    It is used to execute code containing instructions to release the system resources, close the connection, etc.
 */
public class Cwh_85_finally_block {
    
    /** 
     * @return int
     */
    public static int greet(){
        try{
            int a = 50;
            int b = 0;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
        System.out.println("Cleaning up resources....This is the end of the function.");
        }
        return -1;

    }
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
       // int k = greet();
        //System.out.println(k);
        int a = 7;
        int b = 9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally for value of b = "+b);
            }
            b--;
        }
        try{
            System.out.println(500/10);
        }
        finally{
            System.out.println("Yes this is finally without catch- block.");
        }
    }
}
