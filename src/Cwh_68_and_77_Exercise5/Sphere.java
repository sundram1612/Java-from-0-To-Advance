package Cwh_68_and_77_Exercise5;

public class Sphere extends Shape {
   Sphere(int dim1, int dim2){
        super(dim1,dim2);
    }
    
    /** 
     * @return double
     */
    public double volume(){
        return 4/3*Math.PI*this.dim1*this.dim1*this.dim1;
    }
    
}
