/*
    Annotation-> Used to provide extra information about program annotation provides metadata to class/methods.
 */
//@FunctionalInterface
//public interface myFunctionalInterface{
//    void thismethod();
//    //void thisMethod2();
//}

class NewPhone extends Phone{
    @Override
    public void showTime(){
        System.out.println("Time is 18:00");
    }

    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}
public class Cwh_108_Annotations {
//    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showTime();
        System.out.println(phone.sum(10, 20));

    }
}
