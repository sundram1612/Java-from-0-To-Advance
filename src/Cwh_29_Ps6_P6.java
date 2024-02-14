public class Cwh_29_Ps6_P6 {
    
    /** 
     * @param args
     */
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6};
        int max= 0;
        for (int e: arr){
            if(e>max){
                max=e;

            }
        }
        System.out.println("The value of the maximum element is: "+max);
        System.out.print(Integer.MIN_VALUE+ " to ");
        System.out.println(Integer.MAX_VALUE);
    }
}
