import java.util.Scanner;

public class Cwh_18_elseif {

    
    /** 
     * @param args
     */
    public static void main(String[] args)
    {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Your Age: ");
            int age = sc.nextInt();

            if(age>56)
            {
                System.out.println("You are Experienced.");
            }

            else if(age>46)
            {
                System.out.println("You are Semi-Experienced.");
            }
            else if(age>36)
            {
                System.out.println("You are Semi-Semi-Experienced.");
            }
            else
            {
                System.out.println("You are not experienced.");
            }
        }
    }
}

//Instead of using multiple if statement we can use also tif along with this if forming an  if-else-if-else ladder.

//Using such kind of logic reduces indents last else is executed only if all the conditions fail.