package Cwh_68_and_77_Exercise5;

public class Square extends Shape {
    Square(int dim1){
        super(dim1,-1);
    }
    
    /** 
     * @return int
     */
    public int area(){
        return this.dim1*this.dim1;
    }
    
}
