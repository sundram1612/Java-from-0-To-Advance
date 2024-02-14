
abstract class Parent{    // Now we had to declare this Parent class as abstract because it is containing abstract method.
    public Parent(){
        System.out.println("I am the constructor of Base2.");
    }
    public void sayHello()
    {
        System.out.println("Hello");
    }
    abstract public void greet();       //it tells to Override greet() method itself and include what you want.
}
class Child extends Parent {
    @Override
    public void greet() {
        System.out.println("Good Morning!");
    }
}
abstract class Child1 extends Child{

    public void meth()
    {
        System.out.println("I am Good.");
    }
}
public class Cwh_53_AbstractClass_and_Method {
    public static void main(String[] args) {
/*
        word 'abstract' --> only existing in thoughts or an idea without real or concrete existence.
        Abstract Method --> A Method that is declared without an implementation
                            ex:- abstract void moveTo(double x, double y)
        Abstract Class --> a class which includes or which have the abstract method(s). So the class itself must be
                            declared as abstract.

        When an abstract class is subclassed, the subclass usually provides implementations for all the methods in
        parent class. If it does not, it must be declared abstract.
 */
        Child ch = new Child();
        
//        Child1 ch1 = new Child1();    Child1 class is an abstract class, so we can not instantiate or make its object.
    }
}
