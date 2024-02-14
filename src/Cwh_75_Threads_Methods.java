class MyNewthr1 extends Thread{
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("Thank You! 1 ");
            try {
                Thread.sleep(200);              // it pauses the execution of a thread for the mentioned milliseconds.
            }
             catch (InterruptedException e) {
                 e.printStackTrace();
            }
            i++;
        }
    }
}

class MyNewthr2 extends Thread{
   public void run(){
        int i = 0;
        while(i<10){
            System.out.println("Thank You! 2 ");
            i++;
        }
    }
}


public class Cwh_75_Threads_Methods {
    public static void main(String[] args) {

        System.out.println("Threading is started.");
        
        MyNewthr1 th1 = new MyNewthr1();
        MyNewthr2 th2 = new MyNewthr2();

        th1.start();

        // try{
        // th1.join();                          // this method will join the 2nd thread after completion of thread 1
        // }
        //  catch(Exception e){
        //     System.out.println(e);
        // }

        th2.start(); 
    }
    
}
