package JavaIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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

        try {
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter("JavaFile.txt"));
            fileWriter.write(message+ firstResponse);
            fileWriter.write(System.getProperty( "line.separator" ));
            fileWriter.write(message2+secondResponse);
            fileWriter.write(System.getProperty( "line.separator" ));
            fileWriter.write("------------------------------");
            fileWriter.write(System.getProperty( "line.separator" ));
            fileWriter.write(yourMessage);
            fileWriter.close();
        }catch(IOException e ){
            e.printStackTrace();
        }

        //add instructions to encrypt message here
    }
}
