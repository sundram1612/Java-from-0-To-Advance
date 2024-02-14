import java.util.Scanner;

public class Cwh_35_Ps7_P2 {
  
  /** 
   * @param n
   */
  static void pattern1(int n){
      for(int i=0; i<=n;i++)
      {
          for(int j=0; j<i; j++)
          {
              System.out.print("🎈");
          }
          System.out.println();
      }

  }
    static void middleLine(int l){
        for(int i= 0; i<=l; i++) {
            System.out.print("🎈");
        }
        System.out.println();
    }
    static void pattern2(int m){
        for(int i=0; i<m; i++)
        {
            for(int j=i; j<m; j++)
            {
                System.out.print("🎈");

            }
            System.out.println();
        }
    }

public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
       pattern1(x);
        middleLine(x);
        pattern2(x);


    }
}
