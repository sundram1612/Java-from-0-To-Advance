interface Mycamera{
    void takeSnap();
    void recordVideo();
//  void record4KVideo(); // on writing this, we will get an error in the line no. 21 that this method has not been
                            // implemented in the child class to fix this error, we use below code.
    default void record4KVideo(){
        System.out.println("Recording in 4K.....!");
    }
}
interface Mywifi{
    String[] getNetworks();
    void connectToNetwork(String network);

}
class MyCellPhone {
    
    /** 
     * @param phoneNumber
     */
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }

}
class Mysmartphone extends MyCellPhone implements Mycamera,Mywifi{
   public void takeSnap()
    {
        System.out.println("Taking Snap...!");
    }
   public void recordVideo(){
        System.out.println("Taking Video...!");
    }
    public void record4KVideo(){
        System.out.println("Taking Snap and Recording in 4K.....!");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of Networks:");
        return new String[]{"Harry", "James", "Anjali7986"};
    }
    public void connectToNetwork(String network)
    {
        System.out.println("Connecting to a Network..."+network);
    }
}

public class Cwh_57_Default_Methods {
    public static void main(String[] args){
        Mysmartphone ms = new Mysmartphone();
        ms.record4KVideo();
        String[] arr = ms.getNetworks();
        for(String item: arr){
            System.out.println(item);

        }

    }
}
// Static method is such type of method which is not associated with object rather it is associated with a class or
// an interface.
/*
Default Methods --> An interface can have static and default methods.
                   Default methods enable us to add new functionality to existing interfaces.
                   This feature was introduced in Java 8 to ensure backward compatibility while updating an interface.
                   classes implementing the interface need not implement the default methods.
                   Interfaces can also include private methods for default methods to use.

 */
