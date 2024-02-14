import javax.sound.sampled.DataLine;

public class Cwh_80_Exception_Handling {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        /*
           Exception in Java -> An exception is an event that occurs when a program is executed disrupting the normal 
           flow of instructions.
           Mainly, There are two types of exceptions in Java:
           1) Checked Exception     - compile time exceptions(handled by compiler)
           2) Unchecked Exception   - Runtime Exceptions

           Commonly Occuring Exceptions:-
           1) NullPointer Exception
           2) Arithmetic Exception
           3) ArrayIndexOutOfBound Exception
           4) IllegalArgument Exception
           5) NumberFormat Exception
         */
        int a = 6000;
        //int b = 9;
        int b = 0;      //this will show an Arithmetic Exception because we initialized b = 0
       
        //WITHOUT TRY-CATCH EXCEPTION HANDLING
        // int c = a/b;
        // System.out.println("The result is: "+c);

        // WITH TRY-CATCH EXCEPTION HANDLING

        try{
        int c = a/b;
        System.out.println("The result is: "+c);
        }
        catch(Exception e){
            System.out.println("We faliled to divide.");
            System.out.println("Reason: "+e);
        }
        System.out.println("--------End of the Program.--------");
        
        
    }
    
}
