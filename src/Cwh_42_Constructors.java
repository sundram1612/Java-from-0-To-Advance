class MainEmployee{
    private int id;
    private String name;

    public MainEmployee()
    {
        id = 0;
        name = "Your-Name-Here";
    }
    public  MainEmployee(String myName, int myId)
    {
        id = myId;
        name = myName;
    }
    public  MainEmployee(String myName)     //Hence this is called Constructor Overloading
    {
        id = 1;
        name = myName;
    }
    
    /** 
     * @return String
     */
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int i)
    {
        id = i;
    }


}
public class Cwh_42_Constructors {
    public static void main(String[] args) {

//        MainEmployee james = new MainEmployee();
//        james.setId(43);
//        james.setName("James Bond");      //Instead of doing these lengthy things we use Constructors
        // Constructor -- A member function used to initialize an object while creating it.
      //  MainEmployee james = new MainEmployee("James Bond",12);
       // MainEmployee james = new MainEmployee();    //this line will call the constructor which does not have any parameters
        MainEmployee james = new MainEmployee("James Bond");
        System.out.println(james.getId());
        System.out.println(james.getName());
        
        
    }
}
