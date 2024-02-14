public class Cwh_29_Ps6_P8 {
    
    /** 
     * @param args
     */
    public static void main(String[] args)
    {
        boolean isSorted = true;
        int[] arr = {1, 2100, 3, 455, 5, 67};
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted)
            System.out.println("The array is sorted.");

        else
            System.out.println("The array is not sorted.");

    }

}
