public class Cwh_26_Arrays {
    
    /** 
     * @param args
     */
    public static void main(String[] args)
    {
       /* Classroom of 500 students- we have t store marks of these 500 students
        we have 2 options:-
        1- Create 500 variables
        2- Use Arrays

        Array is collection of similar types of data
      */
        int[] marks = new int[5];   //Declaration and Memory allocatin

        //or int[] marks;           declaration
        //marks = new int[5];       Memory allocation

        //int[] marks = {100,52,36,89,54};  Declaration and initialization

        marks[0] = 100;
        marks[1] = 90;
        marks[2] = 86;
        marks[3] = 59;
        marks[4] = 80;
        //marks[5] = 50;        throws an error , Index 5 out of bounds for length 5.
        System.out.println(marks[3]);


    }
}
