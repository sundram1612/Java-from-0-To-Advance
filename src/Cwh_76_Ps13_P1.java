class greet1 extends Thread{
    public void run(){
        int i = 0;
        while(i<30){
            System.out.println("Good Morning..!");
            i++;
        }
    }
}
class greet2 extends Thread{
    public void run(){
        int i = 0;
        while(i<30){
            System.out.println("Welcome!");
            i++;
        }
    }
}
public class Cwh_76_Ps13_P1 {
    public static void main(String[] args) {
        greet1 g1 = new greet1();
        greet2 g2 = new greet2();

        g1.start();
        g2.start();
    }
    
}
