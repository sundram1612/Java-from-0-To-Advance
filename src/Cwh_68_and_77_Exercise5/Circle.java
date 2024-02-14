package Cwh_68_and_77_Exercise5;

public class Circle extends Shape {
    Circle(int dim1){
        super(dim1,-1);
    }
    
    /** 
     * @return double
     */
    public double area(){
        return Math.PI*this.dim1*this.dim1;
    }
    
}
