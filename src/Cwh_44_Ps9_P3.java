import java.util.Scanner;

class cylinder2{
    private final double radius;
    private double height;
    /*
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

     */

    public cylinder2(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    
    /** 
     * @return double
     */
    public double volume()
    {
        return (3.14*radius*radius*height);
    }
    
    /** 
     * @return double
     */
    public double surfaceArea()
    {
        return (2*3.142*radius*height) +(2*3.142*radius*radius);
    }

}
public class Cwh_44_Ps9_P3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        cylinder2 MyCylinder = new cylinder2(r,h);

        System.out.println("volume of the Cylinder: "+MyCylinder.volume());
        System.out.println("Surface Area of the Cylinder: "+MyCylinder.surfaceArea());
    }
}