package  day_51;
import java.io.*;
import java.util.Scanner;

public class Code1 {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\JavaSample.txt");
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File created");
            } else {
                System.out.println("Already File Exists");
            }

            // Output stream
            OutputStream output = new FileOutputStream(file);
            Scanner user = new Scanner(System.in);
            System.out.println("Enter the data to insert to file:");
            String string = user.nextLine();
            byte[] bytes = string.getBytes();
            output.write(bytes);
            System.out.println("File Written");
            output.flush();

            // Input stream
            InputStream input = new FileInputStream(file);
            System.out.println("NO OF BYTES IN FILE IS: " + input.available());
            byte[] bytesFromFile = input.readAllBytes();
            System.out.println("BYTES READ FROM FILE:");

            // Print each byte as a character
            for (byte b : bytesFromFile) {
                System.out.print((char) b);
            }

            input.close();
            output.close();
            user.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
