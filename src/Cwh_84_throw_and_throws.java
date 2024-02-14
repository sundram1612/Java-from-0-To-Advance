/*
   The throw keyword is used to throw an exception explicitly by the programmer.
 */

class NegativeRadiusException extends Exception{
    
    /** 
     * @return String
     */
    @Override
    public String toString(){
        return " Radius can not be Negative.";
    }    
    
    /** 
     * @return String
     */
    @Override
    public String getMessage() {
        return " I am getMessage()";
    }
}
public class Cwh_84_throw_and_throws {
    //In java throws keyword is used to declare an exception .
    //This gives an information to the programmer that there might be an exception so, it is better to be prepared
    //with a try-catch block.
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            //We can throw an exception like below 
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r *r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        //Made by Sundram
        int result = a/b;
        return result;

    }
    public static void main(String[] args) {
        // Rahul - uses divide function created by Sundram.
       try{
        int c = divide(6, 0);
        System.out.println("When a is divided by b then: "+c);
       }
       catch(Exception e){
        System.out.println("Exception");
       }

       //Since the area() function can throw an exception so it is necessary to surround the below things inside try-catch block.
       try{
       double ar = area(-6);
       System.out.println("The area of the Circle is: "+ar);
       }
       catch(Exception e){
        System.out.println(e);
       }       
    }
    
}
