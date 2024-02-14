/*
Method Overriding -- If the child class implements the same method present in the parent class again, it is known as...
--> When an object of subclass is created and the override method is called, the method which has been implemented in
    the subclass is called and its code is executed.
 */
class A{
    
    /** 
     * @return int
     */
    public int harry()
    {
        return 4;
    }
    public void meth2()
    {
        System.out.println("I am method 2 of class A ");

    }
}
class B extends A{
    @Override
    public void meth2()
    {
        System.out.println("I am method 2 of class B ");

    }
    public void meth3()
    {
        System.out.println("I am method 3 of class B");
    }
}
public class Cwh_48_Method_Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}
