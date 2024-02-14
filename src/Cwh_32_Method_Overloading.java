public class Cwh_32_Method_Overloading {

    
    /** 
     * @param x
     */
    static void change(int x){
        int a = 98;
    }
    static void change1(int[] yadav) {
        yadav[0] = 98;
    }
    //void return type---when we do not want our method to return anything we use void as the return type.
    static void tellJoke(){
        System.out.println("I invented a new Word!\n"+ "Plagiarism!");
    }

    public static void main(String[] args){
      //  tellJoke();

//        Case 1: Changing the integer

//        int x =45;
//        change(x);
//        System.out.println("The value of x after running change is- "+x);

//        Case 2:Changing the Array

        int [] marks = {52,73,77,89,98,94};
        change1(marks);
        System.out.println("The value of marks after running change is: "+marks[0]);
        // In case of Arrays, the reference is passed same is the case for object passing to methods
    }
}
