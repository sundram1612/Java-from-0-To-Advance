import java.util.Scanner;

public class Cwh_19_Ps4_P2 {

    
    /** 
     * @param args
     */
    public static void main(String[] args)
    {


        //Problem 2

        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks in Physics: ");
        m1 = sc.nextByte();

        System.out.print("Enter your marks in Chemistry: ");
        m2 = sc.nextByte();

        System.out.print("Enter your marks in Mathematics: ");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your Percentage is : "+avg);

        if(avg>=40 && m1>=33 && m2>=33 && m3>=33)
        {
            System.out.println("Congratulations, You have been Promoted.");
        }

        else
        {
            System.out.println("Sorry, You have not been Promoted.");
        }

    }
}
