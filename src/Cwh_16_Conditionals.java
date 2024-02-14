import java.util.Scanner;

public class Cwh_16_Conditionals {

    
    /** 
     * @param args
     */
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("What is Your age ? : ");
            int age = sc.nextInt();

            if(age>18)
            {
                System.out.println("Yes, You can drive!😃");
            }
            else
            {
                System.out.println("No, You can not drive!☹");
            }
        }
    }
}
