interface camera{
    void takeSnap();
    void recordVideo();
    private void greeting(){
        System.out.println("Good Morning!");
    }
    default void record4kVideo(){
        greeting();
        System.out.println("Recording in 4k...!");
    }
}
interface wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class cellPhone{
    
    /** 
     * @param phoneNumber
     */
    void callNumber(int phoneNumber)
    {
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall()
    {
        System.out.println("Connecting...!");
    }
}
    class smartPhone extends cellPhone implements wifi, camera{
        @Override
        public void takeSnap() {
            System.out.println("Taking snap.");
        }
        public void recordVideo(){
            System.out.println("Recording video.");
        }
        public String[] getNetworks(){
            System.out.println("Getting List of Networks: ");
            String[] networkList = {"Harry", "Prasanth", "Divine09"};
            return networkList;
        }
        public void connectToNetwork(String network){
            System.out.println("Connecting to "+network);
        }
        public void sampleMeth(){
            System.out.println("Method of n");
        }
    }

public class Cwh_59_Polymorphism {
    public static void main(String[] args) {

        camera cam = new smartPhone();      // camera as a reference and smartphone as an object. This is a smartphone but use it as a camera only.
       // cam.getNetworks();  //Not allowed for good (if you take the smartphone for camera then use it as camera only).
       cam.record4kVideo();
       

       smartPhone s = new smartPhone();
       s.sampleMeth();
       s.record4kVideo();
       s.getNetworks();
       s.callNumber(986572);
       
    }
}