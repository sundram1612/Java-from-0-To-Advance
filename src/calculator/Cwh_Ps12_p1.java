package calculator;


class Calculator1{
    
    /** 
     * @param a
     * @param b
     */
    public void calculate(int a, int b){
        System.out.println("Your result is: "+ (a+b));
    }
}
class ScCalculator{
    public void calculate(int x, int y){
        System.out.println("Your result is: "+ Math.sin(x+y));
    }
}
class HyCalculator{
    public void calculate(int s, int p){
        System.out.println("Your result is: "+ (s+p));
        System.out.println("The value of result is: "+ Math.sin(s+p));
        
    }
}

public class Cwh_Ps12_p1 {
    public static void main(String[] args) {
        System.out.println("I am main Method.");
        HyCalculator h = new HyCalculator();
        h.calculate(50, 10);
    }
}
