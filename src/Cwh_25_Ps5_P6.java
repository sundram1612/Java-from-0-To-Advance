import java.util.Scanner;

public class Cwh_25_Ps5_P6 {

    
    /** 
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want factorial of: ");
        int n = sc.nextInt();

        int i = 1;
        long factorial =1;
        while(i<=n)
        {
            factorial=factorial*i;
            i++;

        }
        System.out.println("Factorial of a given number is: "+factorial);
    }
}


