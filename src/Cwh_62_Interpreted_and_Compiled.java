/*
Interpreter translate one statement at a time into machine code.(Line by line translation of statement to machine code)
Interpreter can vary from OS to OS. Different for different machine and every OS would have their own machine code.It is needed everytime.
Partial execution if error.Easy for programmers. Eg.- PHP, Ruby, JavaScript, Python,etc. It is slower than Compiler.

Where as Compiler scans the entire program and translate whole of it into machine code. It will aslo different for 
different machine but it scans the whole program, compile it and make a machine code file to run many times.Once compiled not needed.
No execution if an error occurs.Usually not as easy as interpreted once.It is fast.Eg. - C, C++, C#, etc.
 */
public class Cwh_62_Interpreted_and_Compiled {

}
/*
 Java is a hybrid language i.e. both compiled as well as interpreted language.

    [java file](harry.java) ----compiled using javaC----> [class file](harry.class(bytecode))------>can be used by
                                                                                            java interpreter.
    ---> A JVM can be used to interprete this bytecode.
    ---> This bytecode can be taken to any platform (Win/Mac/Linux) for execution.
    ---> Hence Java is platform independent (write once run anywhere).
    
 */