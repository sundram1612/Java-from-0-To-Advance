import java.util.Scanner;

public class Cwh_25_Ps5_P11 {
    
    /** 
     * @param args
     */
    public static void main(String[] args)
    {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first n numbers which you want to add: ");
        int n = sc.nextInt();
        int i = 0;
        while(i<n)
        {
            sum = sum + (2 * i);
            i++;
        }
        System.out.println("sum of even numbers is: "+sum);
    }
}
