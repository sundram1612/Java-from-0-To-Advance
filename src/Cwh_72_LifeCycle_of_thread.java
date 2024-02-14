/*
 Life Cycle of a thread:-
 New --> Runnable --> Running --> Terminated
                |----Non-Runnable(Blocked) 

1) New -> Instance of thread created which is not yet started by invoking start().
2) Runnable -> After invoking of start() and before it is selected to be run by the scheduler.
3) Running -> After thread scheduler has selected it.
4) Non-Runnable -> Thread alive, not eligible to run.
5) Terminated -> Run() method has exited.

 */
public class Cwh_72_LifeCycle_of_thread {
    
    
    public static void main(String[] args) {
        
    }
    
}
