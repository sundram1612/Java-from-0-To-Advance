import java.util.Scanner;

public class Cwh_19_Ps4_P3 {
    
    /** 
     * @param args
     */
    public static void main(String[] args)
    {
        float tax = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Income in Lakhs per Annum: ");
        float income = sc.nextFloat();

        if(income<2.5)
        {
            tax = tax+0;
        }
       else if(income>2.5f && income<=5f)
        {
            tax = tax+0.05f*(income-2.5f);
        }

        else if(income>5f && income<=10f)
        {
            tax = tax+0.05f*(5.0f-2.5f);
            tax = tax+0.2f*(income-5.0f);
        }

        else if(income>10f)
        {
            tax = tax+0.05f*(5.0f-2.5f);
            tax = tax+0.2f*(10.0f-5.0f);
            tax = tax+0.3f*(income-10.0f);
        }
        System.out.println("The Total tax paid by the employee is: "+tax);
    }
}
