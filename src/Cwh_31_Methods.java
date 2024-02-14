
public class Cwh_31_Methods {
    
    /** 
     * @param x
     * @param y
     * @return int
     */
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args){
        int a = 5;
        int b = 7;
        int c = logic(a,b);         //1st way  to Call a Method
        System.out.println("The addition of a and b is "+c);

        int a1= 2;
        int b1= 1;
        int c1= logic(a1,b1);
        System.out.println("The addition of a1 and b1 is "+c1);
    }

}
