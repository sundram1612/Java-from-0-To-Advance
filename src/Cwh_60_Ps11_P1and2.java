abstract class Pen{
    abstract void write();
    abstract void refil();
}
class fountainPen extends Pen{
    void write(){
        System.out.println("Writing via Pen.");

    }
    void refil(){
        System.out.println("Refilling the Pen.");
    }
    void changeNib(){
        System.out.println("Changing the Nib.");
    }
}

public class Cwh_60_Ps11_P1and2 {
    public static void main(String[] args) {
        fountainPen pen = new fountainPen();
        pen.changeNib();
        pen.refil();        
    }
    
}
