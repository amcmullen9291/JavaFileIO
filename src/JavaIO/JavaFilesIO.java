package JavaIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFilesIO {
    static String message = "This input is from JavaFilesIO.java ";
    static String message2 = "This text is also from JavaFilesIO.java";

    public static void main(String[] args) {

        try {
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter("JavaFile.txt"));
            fileWriter.write(message);
            fileWriter.write(System.getProperty( "line.separator" ));
            fileWriter.write(message2);
            fileWriter.close();
        }catch(IOException e ){
            e.printStackTrace();
        }
    }
}
