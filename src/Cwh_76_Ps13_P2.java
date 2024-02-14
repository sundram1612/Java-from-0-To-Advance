class greet10 extends Thread{
    public void run(){
        int i = 0;
        while(i<30){
            System.out.println("Good Morning..!");
            i++;
        }
    }
}
class greet11 extends Thread{
    public void run(){
        int i = 0;
        while(i<30){
            System.out.println("Welcome!");
            try {
                Thread.sleep(200);
            } 
            catch (InterruptedException e) {
                 e.printStackTrace();
            }
            i++;
        }
    }
}

public class Cwh_76_Ps13_P2 {
    public static void main(String[] args) {
        greet10 g10 = new greet10();
        greet11 g11 = new greet11();
        g10.setPriority(Thread.MIN_PRIORITY);        g11.setPriority(Thread.MAX_PRIORITY);

        System.out.println(g10.getPriority());
        System.out.println(g11.getPriority());

        g10.start();
        g11.start();
        System.out.println(g11.getState());
        System.out.println(Thread.currentThread().getState());          //Current() method tells the current state of the thread
                                                                        //and getState() returns the state a thread.
        
    }
    
}
