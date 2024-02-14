/*
 Multiprorgramming and multithreaing both are used to achieve multitasking.
 Multi-threading is something which help to achieve concurrency in doing tasks. 

---> process1        process2        process3  are going on in an OS simultaneously.

In a nut shell...
i) Threads use shared memory area.
ii) Threads- faster context switching
iii) A thread is light-weight where as process is heavy- weight.
for example- A word processor can have one thread running in foreground as an editor and another thread in 
            the background auto saving the document.

Flow of control in java:-
1) Without threading:
            main()  -> func()   ->func1()   -> End (In this each call will get executed one by one so it becomes slower.)

2)With threading:
            main()-                 }
                 func()-            }   -> End (We can run all three concurrently by this way we can do the execution fast).
                    func1()-        }

Creating a thread:-
There are two ways to create a thread in java.
i) By extending Thread class
ii) By implementing Runnable interface.

*/
public class Cwh_69_Multithreading {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(" ");        
    }
}
