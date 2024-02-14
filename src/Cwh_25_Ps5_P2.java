import java.util.Scanner;

public class Cwh_25_Ps5_P2 {

/** 
 * @param args
 */
public static void main(String[] args) {
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first n numbers which you want to add: ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
        sum = sum + (2 * i);
    }
    System.out.println("Sum of even numbers is: "+sum);
  }
}