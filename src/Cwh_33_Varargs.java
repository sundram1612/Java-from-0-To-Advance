import com.sun.security.jgss.GSSUtil;

public class Cwh_33_Varargs {

    
    /** 
     * @return int
     */
    // Variable Arguments -- A function with vararg can be created in java using the following syntax:

//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//
//    static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }
    // we made so many methods above, to resolve above problem we use "Varargs", which is following:
    public static int sum(int...array){
        //available as int[] array;
        int result = 0;
        for(int a:array){
            result += a;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("____________Welcome to Varargs Tutorial____________");
        System.out.println("The sum of 4 and 5 is "+sum(4,5));
        System.out.println("The sum of 4, 3 and 5 is: "+sum(4,3,5));
        System.out.println("The sum of 2, 4, 3 and 5 is: "+sum(2,4,3,5));
        System.out.println("The sum of Nothing is: "+sum());

    }
}
