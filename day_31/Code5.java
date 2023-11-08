package day_31;

	import java.io.BufferedReader;
	import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

public class Code5 {
	    public static void main(String[] args) {
	        // File path
	        String filePath = "sample.txt";

	        // Data to write 
	        String dataToWrite = "Hello, this is a sample text to write to a file.";

	        try {
	           
	            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
	            writer.write(dataToWrite);
	            writer.close();
	            System.out.println("Data written to the file using BufferedWriter.");
	            BufferedReader reader = new BufferedReader(new FileReader(filePath));
	            String line;
	            StringBuilder dataRead = new StringBuilder();

	            while ((line = reader.readLine()) != null) {
	                dataRead.append(line).append("\n");
	            }
	            reader.close();
	            System.out.println("Data read from the file using BufferedReader:");
	            System.out.println(dataRead.toString());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Delete file
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
