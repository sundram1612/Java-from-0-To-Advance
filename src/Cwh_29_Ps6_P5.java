public class Cwh_29_Ps6_P5 {
    
    /** 
     * @param args
     */
    public static void main(String[] args){

        int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int temp;
        int n = Math.floorDiv(l,2);

        for(int i=0; i<n; i++){
            //Swap a[i] and [l-i-1]

            temp = arr[i];
            arr[i]= arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element: arr){
            System.out.print(element+ " ");
        }
    }

}
