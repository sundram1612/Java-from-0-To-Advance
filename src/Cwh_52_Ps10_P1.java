class circle{
    public int radius;
    circle()
    {
        System.out.println("I am Non-Parameterized constructor of circle.");
    }
    circle(int r){
        System.out.println("I am circle parameterized constructor.");
        this.radius = r;
    }
    
    /** 
     * @return double
     */
    public double area()
    {
        return  (3.142*this.radius*this.radius);
    }
}
class Cylinder1 extends circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println(" I am cylinder parameterized constructor.");
        this.height = h;
    }
    public double volume()
    {
       return (3.142*this.radius*this.radius*this.height);
    }
}
public class Cwh_52_Ps10_P1 {
    public static void main(String[] args) {
       Cylinder1 cy = new Cylinder1(5,10);
        System.out.println(cy.volume());

    }
}
