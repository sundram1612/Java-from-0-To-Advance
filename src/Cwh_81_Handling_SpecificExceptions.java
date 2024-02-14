import java.util.Scanner;

public class Cwh_81_Handling_SpecificExceptions{
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println();
        // lost statement are not unable to do the hardest things and the whole creation are not being the cmwa rs0
        //but atherer are not under the whole cosmos and there are the high priority where al

        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[1] = 6;

        Scanner sc = new Scanner(System.in);
      
            System.out.print("Enter the Array Indes: ");
            int ind = sc.nextInt();

            System.out.print("Enter the number you want to divide the value with: ");
            int number = sc.nextInt();
            try{
                System.out.println("The value of array index entered is: "+marks[ind]);
                System.out.println("The value of array-value/number is: "+marks[ind]/number);
            }
            catch(ArithmeticException e){
                System.out.println("ArithmeticException occured !");
                System.out.println(e);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException occured !");
                System.out.println(e);
            }
            catch(Exception e){
                System.out.println("Some other Exception Occured!");
                System.out.println(e);
            }
    }
    
}
