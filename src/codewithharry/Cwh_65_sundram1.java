package codewithharry;
import codewithharry.Cwh_65_sundram2;

class UsingPackage extends Cwh_65_sundram2{
    void meth2(){
        System.out.println(x);
        System.out.println(z);
     //   System.out.println(a);  // It will show an error because it is declared private, and we are using it in another method
    }
}


public class Cwh_65_sundram1 {
    public static void main(String[] args) {
        System.out.println("It is the 1st source file of the packages we made.");
        // Cwh_65_sundram2 c = new Cwh_65_sundram2();
        // System.out.println(c.x);
        // System.out.println(c.y);
        // System.out.println(c.z);
        // System.out.println(c.a);

        UsingPackage u = new UsingPackage();
       u.meth2();
    }
}
