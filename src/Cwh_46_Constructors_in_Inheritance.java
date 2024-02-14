class Base1{
    Base1(){
        System.out.println("I am a constructor of Base1.");
    }
    Base1(int x){
        System.out.println("I am an Overloaded Constructor of Base1 class with value of X is "+x);
    }

}
class Derived1 extends Base1{
    Derived1(){
        super(52);
        System.out.println("I am the constructor of Derived class.");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am the Overloaded constructor of Derived class with value of Y is "+y);
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of Derived Constructor. ");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am a child of Derived Constructor with value of Z is "+z);
    }

}
public class Cwh_46_Constructors_in_Inheritance {
    public static void main(String[] args) {
        //Base1 b = new Base1();
        //Derived1 d = new Derived1();
       // Derived1 d = new Derived1(12,15);
        //ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(12,15,23);


        /* When a Derived class is extended from the Base class, the constructor of the Base class is executed first
        followed by the constructor of the Derived class.

        Constructors during Constructor Overloading -- When there are multiple constructors in the parent class, the
        constructor without any parameters is called from the child class.
        If we want to call the constructor with parameters from the parent class, we can use 'super' Keyword.
                                               "super(a,b);"
        */
    }
}
