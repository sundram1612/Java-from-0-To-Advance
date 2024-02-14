import java.util.Scanner;

class Rectangle2{
    public double length;
    public double breadth;
    Rectangle2(){
        System.out.println("I am Non-parameterized constructor of Rectangle2 class.");
    }
    Rectangle2(double l, double b){
        this.length = l;
        this.breadth = b;
        System.out.println("This is the parameterized constructor of Rectangle2 class.");
        System.out.println("The Area of Rectangle2 is: "+area());
    }
    
    /** 
     * @return double
     */
    public double area()
    {
        return length*breadth;
    }
    
    /** 
     * @return double
     */
    public double perimeter()
    {
        return 2*(length+breadth);
    }
}
class Cuboid extends Rectangle2{
    public double height;
    Cuboid()
    {
        System.out.println("I am Non-parameterized constructor of Cuboid class.");
    }
    Cuboid(double l, double b, double h)
    {
        super(l,b);
        this.height = h;
        System.out.println("I am parameterized constructor of Cuboid class.");
        System.out.println("The Volume of Cuboid is: "+volume());
    }
    public double volume()
    {
        return length*breadth*height;
    }
}
public class Cwh_52_Ps10_P2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        double x = sc.nextDouble();

        System.out.print("Enter Breadth: ");
        double y = sc.nextDouble();

        System.out.print("Enter Height:");
        double z = sc.nextDouble();

        Cuboid cu = new Cuboid(x,y,z);
//      Rectangle2 rec =new Rectangle2(x,y);
    }
}