package JavaIO;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import java.io.*;

public class EncryptedText {

    static JavaFilesIO hiddenMessage;

    public static void main(String[] args) throws FileNotFoundException {

//        char[] yourMessage = new char[hiddenMessage.input1.length];
//        String text = hiddenMessage.input1;
//        char[] newOriginalMessage = new char[originalMessage.length];
//        for(int i=0; i<originalMessage.length; i++){
//            char c = originalMessage[i];
//            c+=1;
//            newOriginalMessage[i] = c;
//        }


//        String reversedReverseMessage = String.valueOf(hiddenMessage.input1);
//        StringBuilder input2 = new StringBuilder();
//
//         append a string into StringBuilder input1
//        input2.append(reversedReverseMessage);
//
//         reverse StringBuilder input1
//        input2.reverse();

        try{
            StringBuilder sb = new StringBuilder();
            BufferedReader FileReader = new BufferedReader(new FileReader("JavaFile.txt"));
            String line = "";
            int s = 1;
            while ((line = FileReader.readLine()) != null) {
                while(s<=2) {
//                    System.out.println(line);
//                    sb.append(line);
                    sb.append('\n');
//                    System.out.println(line);
                    s++;
                }
                sb.append(line);
                    System.out.println(line);
            }

//            StringBuilder reversedReverseMessage = JavaFilesIO.input1;
//            StringBuilder input = new StringBuilder();

//        input.append("end of text.");

//            System.out.println(input);
 //note just turn the BufferedReader text into a char[]
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    //receive encoded message here and System.out.print the decrypted value

}
