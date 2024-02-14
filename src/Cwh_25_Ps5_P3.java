import java.util.Scanner;

public class Cwh_25_Ps5_P3 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter which table you want: ");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++)
        {
            System.out.printf("%d X %d  = %d\n",n,i,n*i);

        }
    }
}
