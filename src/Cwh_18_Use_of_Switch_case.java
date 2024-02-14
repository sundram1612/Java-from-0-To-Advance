import java.util.Scanner;

//Switch case control instruction--Switch case is used when we have to make a choice between number of
//alternatives for a given variable.
public class Cwh_18_Use_of_Switch_case {

    
    /** 
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        switch (age) {
            case 18 -> System.out.println("You are going to become an adult.");
            case 23 -> System.out.println("You are going to get a job.");
            case 60 -> System.out.println("You are going to get retired.");
            default -> System.out.println("Enjoy Your Life!");
        }

        System.out.println("Thanks for using my Java code!");

    }



}
