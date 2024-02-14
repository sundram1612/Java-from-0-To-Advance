import java.util.concurrent.Callable;

class CellPhone{
    public void ring(){
        System.out.println("Ringing.....");
    }
    public void vibrate(){
        System.out.println("Vibrating.....");
    }
    public void callFriend(){
        System.out.println("Calling Rahul.....");
    }
}
public class Cwh_39_Ps8_P2 {
    public static void main(String[] args) {
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.ring();
        asus.vibrate();
    }
}
