import java.util.Scanner;

class Rectangle{
    float length;
    float breadth;
    
    /** 
     * @return float
     */
    public float area(){
        return length*breadth;
    }
    public float perimeter(){
        return 2*(length+breadth);
    }
}
public class Cwh_39_Ps8_P6 {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length = ");
        rec.length = sc.nextFloat();

        System.out.print("Enter Breadth = ");
        rec.breadth = sc.nextFloat();

        System.out.println("The Area of Rectangle is "+rec.area());
        System.out.println("The Perimeter of Rectangle is "+rec.perimeter());
    }
}
