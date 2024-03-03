import java.io.File;
import java.io.IOException;

public class prog_112 {
    public static void main(String[] args) throws IOException {
        // prog_111
        for (int i = 1; i < 11; i++) {
            File myFile = new File("practice_" + i+".java");
            myFile.createNewFile();
        }
    }
}
