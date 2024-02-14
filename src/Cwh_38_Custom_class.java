//Any real world Object == Properties + Behaviour
//Objects in Oops == Attributes + methods
class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("And My name is "+name);
    }
    
    /** 
     * @return int
     */
    public int getSalary() {
        return salary;
    }
}
public class Cwh_38_Custom_class {
    public static void main(String[] args) {
        System.out.println("This is our Custom Class.");

    Employee harry = new Employee();        //Instantiating a new Employee Object
    Employee john = new Employee();        //Instantiating a new Employee Object


        //Setting properties/attributes for harry
        harry.id = 12;
        harry.salary = 34;
        harry.name = "CodeWithHarry";

        //Setting properties/attributes for John
        john.id = 17;
        john.salary = 23;
        john.name = "John Tripathi";

        //Printing the Attributes
//        System.out.println(harry.id);
//        System.out.println(harry.name);

        //Instead of doing above for printing we can simply do the following method call,
        harry.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
    }
}
