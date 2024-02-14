import java.util.Scanner;

public class Cwh_19_Ps4_P6 {

    
    /** 
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the Website: ");
        String website = sc.next();

        if(website.endsWith(".org"))
        {
            System.out.println("This is an Organisation Website.");
        }
        else if(website.endsWith(".com"))
        {
            System.out.println("This is a Commercial Website.");
        }
        else if(website.endsWith(".in"))



        
        {
            System.out.println("This is an Indian Website.");
        }
    }
}
