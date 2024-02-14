package Cwh_68_and_77_Exercise5;

public class Rectangle extends Shape {
    Rectangle(int dim1, int dim2){
        super(dim1,dim2);
    }
    
    /** 
     * @return int
     */
    public int area(){
        return this.dim1*this.dim2;
    }

/** 
 * @param args
 */
public static void main(String[] args) {
    Rectangle rec = new Rectangle(10,20);
    System.out.print("The area of the Rectangle is: "+ rec.area());
   

}    
}
