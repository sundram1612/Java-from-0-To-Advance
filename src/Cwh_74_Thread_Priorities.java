class Mythr1 extends Thread{
    public Mythr1(String name){
        super(name);
    }
    public void run(){
        int i = 1;
       while(i<50){
        System.out.println("Thank You! "+ this.getName());
        i++;
       }
    }
}
public class Cwh_74_Thread_Priorities {
    public static void main(String[] args) {
    
        /*
         Ready Queue T1 T2 T3 T4 T5
         */
        Mythr1 t1 = new Mythr1("Sundram");
        Mythr1 t2 = new Mythr1("Sundram1");
        Mythr1 t3 = new Mythr1("Sundram2");
        Mythr1 t4 = new Mythr1("Sundram3");
        Mythr1 t5 = new Mythr1("Sundram4");

        t5.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}