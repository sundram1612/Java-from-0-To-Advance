class Rectangle1{
    private int length;
    private int breadth;

    
    /** 
     * @return int
     */
    public int getLength() {
        return length;
    }
    
    /** 
     * @return int
     */
    public int getBreadth() {
        return breadth;
    }

    public Rectangle1() {
        this.length = 4;
        this.breadth =5;
    }
    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}
public class Cwh_44_Ps9_P4 {
    public static void main(String[] args) {
        Rectangle1 rec = new Rectangle1();
        System.out.println("Length of the Rectangle: "+rec.getLength());
        System.out.println("Breadth of the Rectangle: "+rec.getBreadth());

        System.out.println("|----Printing Dimensions Using Constructor Overloading----|");

        Rectangle1 rect = new Rectangle1(10,20);
        System.out.println("Length of the Rectangle: "+rec.getLength());
        System.out.println("Breadth of the Rectangle: "+rec.getBreadth());


    }
}
