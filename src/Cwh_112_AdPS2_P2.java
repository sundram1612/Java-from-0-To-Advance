class Mydeprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am method 1.");
    }
}
interface MyInt{
    void display();
}
public class Cwh_112_AdPS2_P2 {
    public static void main(String[] args) {
        Mydeprecated d = new Mydeprecated();
        d.meth1();
        MyInt i = () -> System.out.println("I am a display.");
    }
}
