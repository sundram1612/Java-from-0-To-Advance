
class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        int i = 1;
        while(i<4){
            System.out.println("I am a Thread.");
            i++;
        }
    }
}
public class Cwh_73_thread_constructors {
    public static void main(String[] args) {
        Mythr t = new Mythr("Sundram");
        t.start();
        Mythr t1 = new Mythr("Ram chandra");
      //  t.start();
        t1.start();
        System.out.println("The id of the thread t is "+t.threadId());
        System.out.println("The name of the thread t is "+t.getName());

        System.out.println("The id of the thread t1 is "+t1.threadId());
        System.out.println("The name of the thread t1 is "+t1.getName());
    }
}
