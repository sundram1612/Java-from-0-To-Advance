package Cwh_68_and_77_Exercise5;

public class Cylinder extends Shape {
    Cylinder(int dim1, int dim2){
        super(dim1, dim2);
    }
    
    /** 
     * @return double
     */
    public double surfaceArea(){
        return 2*Math.PI*this.dim1*(this.dim1*this.dim2);
    }
    
}

