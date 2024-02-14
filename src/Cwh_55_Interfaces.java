interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHornK3g();
    void blowHornMHN();
}

class AvonCycle implements Bicycle,HornBicycle{     // we can implement more than one interfaces from a class
    void blowHorn(){
        System.out.println("peee....peee...pooo..poooo");
    }
    
    
    public void applyBrake(int decrement){
        System.out.println("Applying Brake! ");
    }
    
    /** 
     * @param increment
     */
    public void speedUp(int increment){
        System.out.println("Applying Accelerator");
    }
    public void blowHornK3g()
    {
        System.out.println("Kabhi Khushi Kabhi gam.");
    }
   public void blowHornMHN()
    {
        System.out.println("Mai Hoon Na.");
    }
}
public class Cwh_55_Interfaces {
    public static void main(String[] args)
    {
        AvonCycle cycle1 = new AvonCycle();
        cycle1.applyBrake(2);
        System.out.println(cycle1.a);   // we can create properties in Interfaces.

//        cycle1.a = 45;  // We can not modify the properties in Interfaces as they are final.
//        System.out.println(cycle1.a);
        cycle1.blowHornK3g();
        cycle1.blowHornMHN();
    }
}
