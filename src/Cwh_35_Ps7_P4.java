
// Program to find nth fibonacci series using recursion
public class Cwh_35_Ps7_P4 {
    
    /** 
     * @param n
     * @return int
     */
    static int fib(int n)
{
    if(n==0)
    {
        return 0;
    }
    if(n==1||n==2)
    {
        return 1;
    }
    return fib(n-1)+fib(n-2);
}
    public static void main(String[] args){

        int result =fib(4);
        System.out.println(result);
    }
}
