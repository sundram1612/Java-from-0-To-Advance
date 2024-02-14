import java.util.Scanner;

public class Cwh_35_Ps7_P1 {

    
    /** 
     * @param n
     */
    static void multiplication(int n){
        for(int i=1; i<=10; i++)
        {
            System.out.format("%d X %d  =  %d\n",n,i,n*i);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter which table you want to print: ");
        int tableOf = sc.nextInt();

        multiplication(tableOf);
    }
}
