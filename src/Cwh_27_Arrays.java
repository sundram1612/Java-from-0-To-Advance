public class Cwh_27_Arrays {
    
    /** 
     * @param args
     */
    public static void main(String[] args)
    {
     //   int[] marks = {100,52,36,89,54};
        float[] marks = { 98.14f,45.2f,56.45f,85.36f,50.02f};
        //String[] students = {"Sundram", "Rohan","Rahul","Govind"};
      //  System.out.println(students.length);
        //System.out.println(marks.length);
        System.out.println(marks[1]);

        //Displaying the array using for-loop
        System.out.println("Printing Using for loop");
        for(int i=0; i<marks.length; i++)
        {
            System.out.println(marks[i]);           //Array Traversal
        }

        //Displaying the array using for-loop in reverse order
        System.out.println("Printing for-loop in reverse order");
        for(int i = marks.length-1; i>=0; i--)
        {
            System.out.println(marks[i]);

        }
    }

}
