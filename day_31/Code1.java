package day_31;
import java.io.File ;
import java.io.IOException;
public class Code1 {
	    public static void main(String[] args) {
	      String filePath = "path to file creation";
	        File file = new File(filePath);

	        try {
	            if (file.createNewFile()) {
	                System.out.println("File created: " + filePath);
	            } else {
	                System.err.println("File already exists: " + filePath);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        //check file present or not
	        if (file.exists()) {
	            System.out.println("File name- " + file.getName());
	            System.out.println("File path- " + file.getAbsolutePath());
	            System.out.println("Is a file- " + file.isFile());
	        } else {
	            System.err.println("File does not exist.");
	        }
	        if (file.exists()) {
	            if (file.delete()) {
	                System.out.println("File deleted: " + filePath);
	            } else {
	                System.err.println("File deletion failed.");
	            }
	        } else {
	            System.err.println("File does not exist.");
	        }
	    
	

}
}
