package day_31;
import java.io.File;
public class Code3 {
	    public static void main(String[] args) {
	        // Create a directory
	        String directoryPath = "D:\\JavacreatedFolder";
	        File directory = new File(directoryPath);

	        if (directory.mkdir()) {
	            System.out.println(directoryPath + " is a directory.");
	        } else {
	            System.err.println(directoryPath + " is not a directory.");
	        }

	        // Create a file
	        String filePath = "D:\\myfile.txt";
	        File file = new File(filePath);

	        try {
	            if (file.createNewFile()) {
	                System.out.println(filePath + " is a file.");
	            } else {
	                System.err.println(filePath + " is not a file.");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


