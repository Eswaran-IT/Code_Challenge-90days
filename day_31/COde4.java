package day_31;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class COde4 {
	    public static void main(String[] args) {
	        // File path
	        String filePath = "path to speciy"
	        		+ "";
	        // Data to write 
	        String dataToWrite = "Hello, this is a sample text to write to a file.";
	        //data to the file
	        try (FileWriter writer = new FileWriter(filePath)) {
	            writer.write(dataToWrite);
	            System.out.println("Data written to the file.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Read data from the file
	        try (FileReader reader = new FileReader(filePath)) {
	            int character;
	            StringBuilder dataRead = new StringBuilder();

	            while ((character = reader.read()) != -1) {
	                dataRead.append((char) character);
	            }

	            System.out.println("Data read from the file:");
	            System.out.println(dataRead.toString());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Delete the file (optional)
	        File file = new File(filePath);
	        if (file.exists()) {
	            if (file.delete()) {
	                System.out.println("File deleted.");
	            } else {
	                System.err.println("File deletion failed.");
	            }
	        } else {
	            System.err.println("File does not exist.");
	        }
	    
	}

}
