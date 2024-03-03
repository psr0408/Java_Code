import java.io.File;
import java.io.IOException;

public class prog_111_01 {
    public static void main(String[] args) throws IOException {
        // for(int i = 0; i<5; i++){
        // File myFile = new File("prashant"+(i+1)+".txt");
        //  myFile.createNewFile();
        // }
        for(int i = 0; i<5; i++){
        File myFile = new File("prashant"+(i+1)+".txt");
            try{ myFile.delete();
            }
            catch(Exception e){
                System.out.println("Error orccour while delete the file");
            }
    }
        
    
    }
}
