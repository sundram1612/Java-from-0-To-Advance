abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class smartTelePhone extends TelePhone{
     void ring(){
        System.out.println("Telephone is Ringing.");
    }
    void lift(){
        System.out.println("Telephone has been lifted up.");
    }
    void disconnect(){
        System.out.println("Call disconnedted.");
    }
}
public class Cwh_60_Ps11_P4 {
    public static void main(String[] args) {
        TelePhone t = new smartTelePhone();
        t.disconnect();
        System.out.print("Dailing Numbers and now ");
        t.ring();

    }
}
