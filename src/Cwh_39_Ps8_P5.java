class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy......");
    }
    public void run(){
        System.out.println("Running from the enemy......");
    }
    public void fire(){
        System.out.println("Firing the enemy......");
    }
}
public class Cwh_39_Ps8_P5 {
    public static void main(String[] args) {
        Tommy player1 = new Tommy();
        player1.fire();
        player1.hit();
        player1.run();

    }
}
