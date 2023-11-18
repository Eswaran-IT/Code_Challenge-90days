package day_37;
import java.io.*;
public class Code5  {
public static void main(String[] args) {
	System.out.println("File Occurs");
	File file=new File("\\D:\\sample.txt");
	try {
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("file created");
		}	else {
				
			
			file.delete();
			System.out.println(file.exists());
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
}	
}
