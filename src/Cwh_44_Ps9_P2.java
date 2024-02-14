import java.util.Scanner;

class cylinder1{
    private double radius;
    private double height;
    
    /** 
     * @return double
     */
    public double getHeight() {
        return height;
    }
    
    /** 
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double volume()
    {
        return (double)(3.14*radius*radius*height);
    }
    public double surfaceArea()
    {
        return (double)(2*3.142*radius*height)+(2*3.142*radius*radius);
    }

}
public class Cwh_44_Ps9_P2 {
    public static void main(String[] args) {
        cylinder1 myCylinder = new cylinder1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        myCylinder.setRadius(sc.nextDouble());

        System.out.print("Enter height: ");
        myCylinder.setHeight(sc.nextDouble());

        System.out.println("volume of the Cylinder: "+myCylinder.volume());
        System.out.println("Surface Area of the Cylinder: "+myCylinder.surfaceArea());
    }
}
