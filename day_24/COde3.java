package day_24;
import java.io.File ;
import java.io.IOException;
public class COde3 {
public static void main(String[] args) {
	System.out.println("File Operations");
	 String fileName = "example.txt";
	 
     try {
         File file = new File(fileName);
         file.createNewFile();
         if (file.exists()) {
             // Display file details
             System.out.println("File Name: " + file.getName());
             System.out.println("Absolute Path: " + file.getAbsolutePath());
             System.out.println("Canonical Path: " + file.getCanonicalPath());
             System.out.println("File Size: " + file.length() + " bytes");
             System.out.println("Is Readable: " + file.canRead());
             System.out.println("Is Writable: " + file.canWrite());
             System.out.println("Is Executable: " + file.canExecute());
         } else {
             System.out.println("File does not exist.");
         }
     } catch (IOException e) {
         System.err.println("An error occurred: " + e.getMessage());
     }
 }
	

}
