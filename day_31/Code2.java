package day_31;

import java.io.File;
/*
 * to create a folder and multi folders
 * using mkdir and mkdirs->subfolder by path specifications 
 * 
 */

public class Code2 {

	    public static void main(String[] args) {
	        //directory path you want to create
	        String directoryPath = "D:\\Multi";
	        // Create File object 
	        File directory = new File(directoryPath);
	        // create the directory and parent directories by path specify
	        boolean success = directory.mkdirs();

	        if (success) {
	            System.out.println("Directories created successfully.");
	        } else {
	            System.err.println("Directory creation failed.");
	        }
	boolean deletedflag=directory.delete()?true:false;
	System.out.println(deletedflag);
	    
	    
	    
	    
	    
	    }
}
