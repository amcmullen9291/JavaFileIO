package JavaIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class JavaFilesIO {
    static String message = "This input is from JavaFilesIO.java";
    static String message2 = "This text is also from JavaFilesIO.java";

    public static void main(String[] args) {
        System.out.println("Double digit key");
        Scanner response = new Scanner(System.in);
        String firstResponse = response.next();
        System.out.println("Second key");
        Scanner response2 = new Scanner(System.in);
        String secondResponse = response2.next();
        System.out.println("Enter message");
        Scanner response3 = new Scanner(System.in);
        String  yourMessage = response3.nextLine();
        char[] originalMessage = yourMessage.toCharArray();
        char[] newOriginalMessage = new char[originalMessage.length];
        for(int i=0; i<originalMessage.length; i++){
            char c = originalMessage[i];
            c+=1;
            newOriginalMessage[i] = c;
        }
        String reverseMessage = String. valueOf(newOriginalMessage);
        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(reverseMessage);

        // reverse StringBuilder input1
        input1.reverse();


        try {
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter("JavaFile.txt"));
            fileWriter.write(message+ firstResponse);
            fileWriter.write(System.getProperty( "line.separator" ));
            fileWriter.write(message2+secondResponse);
            fileWriter.write(System.getProperty( "line.separator" ));
            fileWriter.write("------------------------------");
            fileWriter.write(System.getProperty( "line.separator" ));
            fileWriter.write(newOriginalMessage);
            fileWriter.write(System.getProperty( "line.separator" ));
            fileWriter.write(String.valueOf(input1));

            // temp original message below for reference
            fileWriter.write(System.getProperty( "line.separator" ));
            fileWriter.write(originalMessage);


            fileWriter.close();
        }catch(IOException e ){
            e.printStackTrace();
        }

        //add instructions to encrypt message here
    }
}
