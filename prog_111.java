import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class prog_111 {
    public static void main(String[] args) throws IOException {
        // File handling in java
        // code to create a new file
        // File myFile = new File("prashant.txt");
        // myFile.createNewFile();

        // to write in a file
        // FileWriter fileWriter = new FileWriter("prashant.txt");
        // fileWriter.write("This is our first file from this java course");
        // fileWriter.close();

        // reading a file
        // File myFile2 = new File("prashant.txt");
        // try (Scanner sc = new Scanner(myFile2)) {
        // while(sc.hasNextLine()){
        // String line = sc.nextLine();
        // System.out.println(line);

        // }
        // sc.close();

        // }
        // catch(Exception e){
        // System.out.println("Unable to read the file");
        // e.printStackTrace();

        // }


        // delete a file
        File myFile1 = new File("prashant.txt");
        if (myFile1.delete()) {
            System.out.println("I have deleted : " + myFile1.getName());
        } else {
            System.out.println("Some problem occurred while deleting the file");
        }
    }
}
