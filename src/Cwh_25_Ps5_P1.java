import java.util.Scanner;

public class Cwh_25_Ps5_P1 {

    
    /** 
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i=n; i>0; i--)
        {
           for(int j=0;j<i;j++)
           {
               System.out.print("*");
           }
            System.out.println("\n");
        }
    }
}
