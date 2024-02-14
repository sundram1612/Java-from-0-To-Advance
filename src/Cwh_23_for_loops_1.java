import java.util.Scanner;

public class Cwh_23_for_loops_1 {
    
    /** 
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer value: ");
        int n = sc.nextInt();

        for(int i = n; i>0; i--)
        {
            System.out.println(i);
        }
    }
}
