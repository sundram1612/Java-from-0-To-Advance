class Employee1{
    int salary;
    String name;
    
    /** 
     * @return int
     */
    public int getSalary(){
        return salary;
    }
    public void setSalary(int s){
        salary =s;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
public class Cwh_39_Ps8_P1 {
    public static void main(String[] args) {
        Employee1 james = new Employee1();

        //setting attributes
        james.setName("James Bond");
        james.setSalary(12000);

        //printing attributes
        System.out.println(james.getName());
        System.out.println(james.getSalary());
    }
}
