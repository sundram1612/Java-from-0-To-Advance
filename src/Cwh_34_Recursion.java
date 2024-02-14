import java.util.Scanner;

public class Cwh_34_Recursion {

    
    /** 
     * @param n
     * @return int
     */
    static int factorial(int n){
        // factorial(n)= n*n-1*n........1
        // factorial(5)= 5*4*3*2*1= 120
        // factorial(n) = n * factorial(n-1)
        if(n==0||n==1)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }
    }

    static int factorial_iterative(int n){

        if(n==0||n==1)
        {
            return 1;
        }
        else
        {
            int product = 1;
            for(int i=1; i<=n; i++)      // 1 to n
            {
                product = product*i;
            }
            return product;
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("The factorial of x using simple method is: "+factorial(x));
        System.out.println("The factorial of x using Iteration is: "+factorial_iterative(x));

    }
}
//Iterativ
