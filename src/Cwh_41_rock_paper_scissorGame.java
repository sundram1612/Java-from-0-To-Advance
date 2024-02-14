

import java.util.Random;
import java.util.Scanner;

public class Cwh_41_rock_paper_scissorGame {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        //0 for Rock
        //1 for Paper
        //2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor: ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(userInput == computerInput){
            System.out.println("Draw");
        }
        else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput ==0 || userInput == 2 && computerInput == 1) {
            System.out.println(".......You Win.....yay!🤩");
        }
        else{
            System.out.println(".....Computer Win....yay!🤩");
        }
       if(computerInput == 0){
           System.out.println("Computer Choice: Rock.");
       } else if (computerInput == 1) {
           System.out.println("Computer Choice: Paper.");
       }
       else{
           System.out.println("Computer Choice: Scissor.");
       }
    }
}