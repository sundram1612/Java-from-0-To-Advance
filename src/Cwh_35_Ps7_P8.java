//program to print pattern using recursion
public class Cwh_35_Ps7_P8 {
    
    /** 
     * @param n
     */
    static void pattern1_rec(int n) {
        if(n>0)
        {
            pattern1_rec(n-1);
            for(int i=0; i<n; i++)
            {
                System.out.print("🎈");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        pattern1_rec(45);
    }
}

