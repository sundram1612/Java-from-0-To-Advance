

    /*  
        We can write our custom Exception using Exception class in java.
        The Exception class has following important methods: 
        1) String toString() -> Executed when sout(e) is run.
        2) void printStackTrace() -> prints stack trace.
        3) String getMessage() -> prints the Exception message

    */

import java.util.Scanner;

class MyException extends Exception{
        
        /** 
         * @return String
         */
        @Override
        public String toString(){
            return " I am toString()";
        }    
        
        /** 
         * @return String
         */
        @Override
        public String getMessage() {
            return " I am getMessage()";
        }
    }
    class MaxAgeException extends Exception{
        @Override
        public String toString(){
            return "Age can not be greater than 125.";
        }    
        @Override
        public String getMessage() {
            return " Make sure that the value of age entered is correct.";
        }
    }
    public class Cwh_83_Exception_Class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        a = sc.nextInt();
        if (a < 9){
            try{
            // throw new MyException();
            throw new ArithmeticException("This is an Exception.");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("finished!");
            }
            System.out.println("Yes Finished!");
        }
    }
    
}
