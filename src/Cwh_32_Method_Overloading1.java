public class Cwh_32_Method_Overloading1 {

static void foo(){
    System.out.println("I am the first use of foo method.");
}


/**
 * @param a
 * @param b
 */
static void foo(int a){  // int a is parameters
    System.out.println("Good Morning "+a+" Bro!");
}
// We can not change the return type of the function to do OverLoading.
static void foo(int a, int b){
    System.out.println("The value of a is "+a+" And the value of b is "+b+ " in the 3rd foo function.");
}
public static void main(String[] args){
    foo();
    foo(300); // here the value of 'a' is argument(arguments are actual values)
    foo(200,300);
    }

}