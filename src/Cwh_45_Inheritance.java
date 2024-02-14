// Inheritance-- Inheritance is used to borrow properties and methods from an existing class
// When a class inherits from a superclass, it inherits parts of superclass methods and fields.
//Java does not support multiple inheritance i.e. two class cannot be superclass for a subclass.
class Base{
    int x;
    
    /** 
     * @return int
     */
    public int getX() {
        return x;
    }
    
    /** 
     * @param x
     */
    public void setX(int x) {
        System.out.println("I am in Base and  Setting X now.");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a constructor.");
    }
}
class Derived extends Base{
  public int y;

    public int getY() {
        System.out.println("I am in Derived and Setting Y now.");
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Cwh_45_Inheritance {
    public static void main(String[] args) {

        //Creating an object of Base Class
        Base b = new Base();
        b.setX(67);
        System.out.println(b.getX());

        //Creating an object of Derived Class
        Derived d  = new Derived();
        d.setX(4);
        System.out.println(d.getX());
        d.setY(55);
        System.out.println(d.getY());
    }
}
