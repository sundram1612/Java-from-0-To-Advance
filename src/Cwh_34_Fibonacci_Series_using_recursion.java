import java.util.Scanner;

public class Cwh_34_Fibonacci_Series_using_recursion {

    
    /** 
     * @param count
     * @return int
     */
    public static int fibRecursion(int count)
    {
        if(count==0)
        {
            return 0;       //0th Fibonacci is 0
        }
        if(count==1||count==2)
        {
            return 1;       //1st and 2nd Fibonacci is 1 and 1 only
        }
        //calling function recursively for nth Fibonacci
        return fibRecursion(count-1) + fibRecursion(count-2);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of fib_len: ");
        int fib_len = sc.nextInt();

        System.out.println("Fibonacci series of "+fib_len+" number is: ");
        for(int i=0; i<fib_len; i++)
        {
            System.out.print(fibRecursion(i)+" ");
        }
    }
}