public class Cwh_28_Multidimensional_Arrays {
    
    /** 
     * @param args
     */
    //Multidimensional arrays are array of arrays, Each element of a M-D array is a array itself.
    public static void main(String[] args)
    {
        int[] mark;        //A 1-D Array
        int[][] flats;      //A 2-D Array

        flats = new int[2][3];

        /*               (0)          (1)         (2)
                        col 1         col 2      col 3
        (0) row 1       (0,0)         (0,1)      (0,2)
        (1) row 2       (1,0)         (1,1)      (1,2)
        */

        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 204;
        flats[1][1] = 205;
        flats[1][2] = 206;
        System.out.println("Printing Using for loop");
        for(int i=0; i<flats.length; i++)
        {
            for(int j=0; j<flats[i].length; j++)
            {
                System.out.print(flats[i][j]);           //Array Traversal
                System.out.print("   ");
            }
            System.out.println();
        }
    }

}
