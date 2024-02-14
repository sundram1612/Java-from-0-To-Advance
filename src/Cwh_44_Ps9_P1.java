class Cylinder
{
   private double radius;
   private double height;

    
    /** 
     * @return double
     */
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
}
public class Cwh_44_Ps9_P1 {
    public static void main(String[] args) {

        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12.5);
        myCylinder.setRadius(30.0);
        double h = myCylinder.getHeight();
        double r = myCylinder.getRadius();
        System.out.println("Height = "+h+" \nRadius = "+r);
        double vol = (3.14*r*r*h);
        System.out.println("Volume Of a Cylinder: "+vol);
    }
}
