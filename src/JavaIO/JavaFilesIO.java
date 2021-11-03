package JavaIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFilesIO {

    public static void main(String[] args) {
        try {
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter("JavaFile.txt"));
            fileWriter.write("This input is from JavaFiles.IO.java");
            fileWriter.close();
        }catch(IOException e ){
            e.printStackTrace();
        }
    }
}
