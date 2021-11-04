package JavaIO;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import java.io.*;

public class EncryptedText {

    static JavaFilesIO hiddenMessage;

    public static void main(String[] args) throws FileNotFoundException {
        int lineNumber = 1;
        try{
            StringBuilder sb = new StringBuilder();
            BufferedReader FileReader = new BufferedReader(new FileReader("JavaFile.txt"));
            String line;
            while ((line = FileReader.readLine()) != null) {
                if(lineNumber <4) {
                    sb.append(line);
                    System.out.println(line);
                    lineNumber++;
                }
            }
            BufferedReader FileReader2 = new BufferedReader(new FileReader("JavaFile.txt"));

//            String lastLine= null;

            String nextLine = "";
            while((nextLine = FileReader2.readLine()) != null) {
                char[] lastLine = nextLine.toCharArray();
                char[] decoded = new char[nextLine.length()];
//                lastLine = nextLine;
                for(int x=0; x<lastLine.length; x++){
                    char m = lastLine[x];
                    m-=1;
                    decoded[x] = m;
                }
                System.out.println(decoded);
            }
                FileReader.close();
                FileReader2.close();

            System.out.println("End of message.");
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
