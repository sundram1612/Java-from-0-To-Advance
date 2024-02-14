public class Cwh_29_Ps6_P4 {
    
    /** 
     * @param args
     */
    public static void main(String[] args){
        int[][] mat1 ={{1,2,3},
                       {4,5,6}};

        int[][] mat2 ={{2,6,13},
                       {3,7,1}};

        int[][] result = {{0,0,0},
                         {0,0,0}};

        for(int i=0; i<mat1.length; i++)        //row number of times
        {
            for(int j=0; j<mat1[i].length; j++) //column number of times
            {
                System.out.format("Setting value for i= %d and j= %d\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        //printing the elements of a 2-D Array
        System.out.println("The sum the two matrix is as");
        for(int i=0; i<mat1.length; i++)        //row number of times
        {
            for(int j=0; j<mat1[i].length; j++) //column number of times
            {
                System.out.print(result[i][j]+"   ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }

            System.out.println();
        }
    }
}
