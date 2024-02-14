public class Cwh_29_Ps6_P2 {
    
    /** 
     * @param args
     */
    public static void main(String[] args)
    {
        float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 45.7f;
        boolean IsInArray = false;
        for(float element: marks){
            if(num==element)
            {
                IsInArray = true;
                break;
            }
        }
        if(IsInArray) {
            System.out.println("The value is present in the Array.");
        }
        else {
            System.out.println("The value is not present in the Array.");
        }
    }



}
