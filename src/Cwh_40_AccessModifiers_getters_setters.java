 class MyEmployee{
    private int id;
    private String name;
     
     /** 
      * @return String
      */
     public String getName(){
         return name;
     }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
         id =i;
    }
}
public class Cwh_40_AccessModifiers_getters_setters {
    public static void main(String[] args) {
    MyEmployee james = new MyEmployee();
//    james.id = 45;
//    james.name ="James Bond";         //throws an error due to private access modifier, so we use the following
        james.setName("James Bond");
        System.out.println(james.getName());
        james.setId(88);
        System.out.println(james.getId());

    }
}
