interface TvRemote{
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
    void channelUp();
    void channelDown();
}

interface smartTvRemote extends TvRemote{
    void open_YouTube();
    void OkGoogle();
    void open_Netflix();
}

class Tv implements smartTvRemote{

    public void powerOn(){
        System.out.println("Tv's Power is getting ON.");
    }
    public void powerOff(){
        System.out.println("Tv's Power is getting OFF.");
    }
    public void volumeUp(){
        System.out.println("Increasing Tv's Sound.");
    }
    public void volumeDown(){
        System.out.println("Decreasing Tv's Sound.");
    }
    public void channelUp(){
        System.out.println("Channel Number Up.");
    }
    public void channelDown(){
        System.out.println("Channel Number down.");
    }
    public void open_Netflix(){
        System.out.println("Opening Netfilx");
    }
    public void OkGoogle(){
        System.out.println("Say something to your Gooogle Assitant.");
    }
    public void open_YouTube(){
        System.out.println("Opening YouTube.");
    }
}
public class Cwh_60_Ps11_P6and7 {
    public static void main(String[] args) {
        Tv cr = new Tv();
        cr.OkGoogle();
        cr.channelUp();
        cr.volumeDown();
        cr.powerOff();
    }
    
}
