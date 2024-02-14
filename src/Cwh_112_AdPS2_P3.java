import java.io.FileWriter;
import java.io.IOException;

public class Cwh_112_AdPS2_P3 {
    public static void main(String[] args) {
        int i = 19;
        String table = "";
        for(int j = 0; j <10; j++){
            table+= i + "X" + (j+1) + "="+i*(j+1);
            table += "\n";
        }
        try{
            FileWriter fileWriter = new FileWriter("Multiplication_table.txt");
            fileWriter.write(table);
            fileWriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
