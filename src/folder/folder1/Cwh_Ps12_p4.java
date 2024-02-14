package folder.folder1;
class c1 extends Cwh_Ps12_p3{
    void problem2(){
        System.out.println(proInt);
        System.out.println(deInt);
    }
}
public class Cwh_Ps12_p4 extends Calculator1{
   
    public static void main(String[] args) {
        System.out.println("I am main method.");
        c1 sc = new c1();
        sc.problem2();
    }
    
}
