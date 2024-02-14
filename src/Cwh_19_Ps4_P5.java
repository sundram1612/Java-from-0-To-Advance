import java.util.Scanner;

public class Cwh_19_Ps4_P5 {

    
    /** 
     * @param args
     */
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year to check whether it is a leap year or not: ");
        int year = sc.nextInt();

        if(year%4==0 && year%100==0 && year%400==0)
        {
            System.out.printf("%d is a Leap Year.",year);
        }

        else
        {
            System.out.printf("%d is not a Leap year.",year);
        }

    }

}
