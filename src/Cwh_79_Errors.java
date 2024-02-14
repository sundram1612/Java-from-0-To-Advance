import java.util.Scanner;

public class Cwh_79_Errors {
   
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        // SYNTAX ERROR DEMO
        // int a = 0           // Error: no semicolon.
        // b = 6;              // Error: there is no data-type being declared for b.

        // LOGICAL ERROR DEMO
        //write a program to print all the prime numbers between 1 to 10
        // System.out.println(2);
        // for(int i = 1; i<5; i++){
        //     System.out.println(2*i+1);      //Error: we thing that it will print the prime numbers but it prints odd numbers between 1 to 10.
        // }

        // RUNTIME ERROR DEMO
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        if(k==0){
        
            System.out.println("Enter another value of k.");
        }
        else{
        System.out.println("Integer part of the 1000 divided by k is: "+1000/k);        // Error: if wrong input is passed to k, eg- k = 0  
        }
    }
    
}
