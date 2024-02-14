class Phone{
    public void showTime()
    {
        System.out.println("Time is 9:40 AM");
    }
    public void on()
    {
        System.out.println("Turning On Phone.......");
    }
}
class SmartPhone extends Phone{
    public void Music()
    {
        System.out.println("Playing Music......");
    }
    public void on()
    {
        System.out.println("Turning On SmartPhone.......");
    }
}
public class Cwh_49_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        //Phone obj = new Phone();        //allowed
        //SmartPhone Mob = new SmartPhone();    //allowed
        //obj.name();


        Phone obj = new SmartPhone();   //allowed,
        //while doing this, object is created when the program will be running and this is called Dynamic Method Dispatch.
//        SmartPhone sm = new Phone();      Not allowed
        obj.on();       //Here, the method of subclass would run because of subclass's object has been created.
        //obj.Music();        //Not allowed


    }
}
