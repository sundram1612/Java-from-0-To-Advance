import java.util.Scanner;

class Square{
    int side;
    
    /** 
     * @return int
     */
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class Cwh_39_Ps8_P3 {
    public static void main(String[] args) {

        Square sq = new Square();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of side: ");
        sq.side = sc.nextInt();

        System.out.println("The area of Square of side "+sq.side+" is: "+sq.area());
        System.out.println("The area of Square of side "+sq.side+" is: "+sq.perimeter());
    }
}
