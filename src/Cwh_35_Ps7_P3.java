public class Cwh_35_Ps7_P3 {
    
    /** 
     * @param n
     * @return int
     */
    static int sumRec(int n)
    {
        if(n==1)        //Base condition which terminate the recursion
        {
            return 1;
        }
        return n+sumRec(n-1);       //it will return the sum of n natural numbers
    }

    public static void main(String[] args)
    {
       System.out.println(sumRec(5));       // execution starts form main method
    }
}
