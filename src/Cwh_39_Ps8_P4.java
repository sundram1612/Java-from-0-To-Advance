import java.util.Scanner;

class Circle{
    float radius;
    
    /** 
     * @return float
     */
    public float area(){
        return (float)(3.14*radius*radius);
    }
    public float circumference(){
        return (float) (2*3.14*radius);
    }
}
public class Cwh_39_Ps8_P4 {
    public static void main(String[] args) {

        Circle cir = new Circle();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius = ");
        cir.radius = sc.nextFloat();

        System.out.println("The Area of Circle is "+cir.area());
        System.out.println("The Circumference of Circle is "+cir.circumference());


    }
}
