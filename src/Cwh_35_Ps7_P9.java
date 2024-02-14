import java.util.Scanner;

public class Cwh_35_Ps7_P9 {
    
    /** 
     * @param c
     * @return float
     */
    public static float cToF(float c)
    {
        float f = (c * 9/5)+32;
        return f;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float x = sc.nextFloat();

        System.out.println("------------Temperature------------");
        System.out.println("Celsius                 Fahrenheit");
        System.out.printf(" %.2f                    %.2f",x,cToF(x));
    }
}
