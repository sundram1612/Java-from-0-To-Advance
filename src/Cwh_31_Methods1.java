//Method invocation using Object Creation
public class Cwh_31_Methods1 {

         
         /** 
          * @param x
          * @param y
          * @return int
          */
         int logic(int x, int y){
            int z;
            if(x>y){
                z = x+y;
            }
            else {
                z = (x+y)*5;
            }
            return z;
        }
        public static void main(String[] args){
            int a = 5;
            int b = 7;
            int c;

            Cwh_31_Methods1 obj = new Cwh_31_Methods1();        //2nd Way to Call a Method
            c = obj.logic(a,b);
            System.out.println("The addition of a and b is "+c);

            int a1= 2;
            int b1= 1;
            int c1;
            c1 = obj.logic(a1,b1);
            System.out.println("The addition of a1 and b1 is "+c1);
        }

    }
//The values from the method call(a and b) are copied to the a and b of the function logic.
//Thus, even if we modify the values of a and b inside the method, the values in the main method will not change.+

