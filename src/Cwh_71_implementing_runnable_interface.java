class MyThreadRunnable implements Runnable{
    public void run(){
        int i = 0;
        while(i<10){
        System.out.println("I am a thread 1 not a threat 1.");
        i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        int j = 0;
        while(j<10){
        System.out.println("I am thread 2 not a threat 2.");
        j++;
        }
    }
}
public class Cwh_71_implementing_runnable_interface {
    public static void main(String[] args) {
        MyThreadRunnable bullet1 = new MyThreadRunnable();
        Thread gun1 = new Thread(bullet1);
        
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        
        //bullet1.start();     // whenever we implement the 'Runnable' interface, we can not run 'start()' method directly, so to fix this we use below codes
        gun1.start();
        gun2.start();

    }
}
