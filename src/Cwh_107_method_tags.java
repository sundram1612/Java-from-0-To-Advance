public class Cwh_107_method_tags {
    /**
     * 
     * @param args These are arguments supplied to the Command Line
     */
    public static void main(String[] args) {
        System.out.println("This is my main method and using param args.");
    }

    /**
     * Hello guys this java docs is all about the method tags.
     * @param i This is the first number to add.
     * @param j This is the second number to add.
     * @return  Sum of first and second numbers.
     * @throws Exception if 'i' is 0
     * @deprecated This method is deprecated please use + operator.
     */
    public int add(int i, int j)throws Exception{
        if(i==0){
            throw new Exception();
        }
        int c;
        c = i + j;
        return c;
    }
}
