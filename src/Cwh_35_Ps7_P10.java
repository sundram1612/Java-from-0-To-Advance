import java.util.Scanner;

public class Cwh_35_Ps7_P10 {
    
    /** 
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.print("Enter n natural numbers you want sum: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++)
        {
            sum = sum+i;
        }
        System.out.println("The sum of "+n+" natural numbers: "+sum);
    }
}
