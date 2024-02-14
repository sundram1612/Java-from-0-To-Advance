class Ekclass{
    /*
    this Keyword -- 'this' keyword is a way for us to reference an object of the class which is being created/referenced.
     */
    Ekclass(int a)
    {
        this.a = a;
    }
    int a;

    
    /** 
     * @return int
     */
    public int getA() {
        return a;
    }

    
    /** 
     * @return int
     */
    public int returnOne()
    {
        return 1;
    }
}
class DoClass extends Ekclass{
    /*
    super Keyword -- a reference variable used ot refer immediate parent class object.
    -->Can be used to refer immediate parent class instance variable
    -->can be used to invoke parent class methods
    -->can be used to invoke parent class constructor
     */
    DoClass(int c)
    {
        super(c);
        System.out.println("I am a constructor.");
    }
}
public class Cwh_47_this_and_super {
    public static void main(String[] args) {
        Ekclass e = new Ekclass(65);
        DoClass d = new DoClass(12);
        System.out.println(e.getA());
    }
}
