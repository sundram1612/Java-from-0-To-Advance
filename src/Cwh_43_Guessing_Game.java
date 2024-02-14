import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;

    
    /** 
     * @return int
     */
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

     Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput()
    {
        System.out.print("Guess The Number: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();

    }
    boolean isCorrectNumber()
    {
        noOfGuesses++;
        if(inputNumber == number){
            System.out.format("Yay...You guessed it right, it was %d\n You guessed it in %d attempts!",number,noOfGuesses);
            return true;
        }
        else if(inputNumber<number) {
            System.out.println("Guessed Number is too less...");
        }
        else if(inputNumber>number) {
            System.out.println("Guessed Number is too high...");
        }
      return false;
    }
}
public class Cwh_43_Guessing_Game {
    public static void main(String[] args) {
        /*
            Create a class Game, which allows a user to play "Guess the Number" game once.
            Game should have the following methods:
            1. Constructors to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            Use properties such as noOfGuesses(int), etc. to get this task done!
         */
        Game g = new Game();
        boolean b = false;
        while(!b){  g.takeUserInput();
        b = g.isCorrectNumber();

        }
    }
}
