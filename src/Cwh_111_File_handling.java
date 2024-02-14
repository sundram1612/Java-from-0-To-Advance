/*  File Handling in Java
    Reading from and writing to files is an important aspect of any programming language.
    We can use the file class in Java to create a file object.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cwh_111_File_handling {
    public static void main(String[] args) {
        //Code to create a new File.

        // File myFile = new File("Cwh111file.txt");
        // try {
        //     myFile.createNewFile();
        // }
        //  catch (IOException e) {
        //     System.out.println("Unable to create this file.");
        //     e.printStackTrace();
        // }
        
        // Code to write to a file.

        // try {
        //     FileWriter mFileWriter = new FileWriter("Cwh111file.txt");
        //     mFileWriter.write("This is our first file from this Java course.\nOkay now Bye!");
        //     mFileWriter.close();
        // } 
        // catch (IOException e) {
        //     System.out.println("Unable to write in the provided file Name.");
        //     e.printStackTrace();
        // }
        
        // Code to Read a file.

        // File mFile = new File("Cwh111file.txt");
        // try {
        //     Scanner sc = new Scanner(mFile);
        //     while(sc.hasNextLine()){
        //         String line = sc.nextLine();
        //         System.out.println(line);
        //     }
        //     sc.close();
        // } 
        // catch (FileNotFoundException e) {
        //    System.out.println("Unable to read the file.");
        //     e.printStackTrace();
        // }

        // Code to delete a file.

        File myFile = new File("Cwh111file.txt");
        if(myFile.delete()){
            System.out.println("I have deleted:"+ myFile.getName());
        }
        else{
            System.out.println("Some problem occured while deleting this file.");
        }
    }
}