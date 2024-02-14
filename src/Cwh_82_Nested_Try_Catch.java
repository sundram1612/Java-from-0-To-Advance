import java.util.Scanner;

public class Cwh_82_Nested_Try_Catch {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[1] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of index: ");
        int ind = sc.nextInt();
        try{
            System.out.println(("Welcome to video no. 82."));
            try{
                System.out.println(marks[ind]);                
            }

            catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Sorry this index does not exist.");
                    System.out.println("Exception in level 2.");
            }

        }
        catch(Exception e){
            System.out.println("Exception in level 1.");
            
        }
    }
    
}
