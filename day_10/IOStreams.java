package day_10;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreams {
public static void main(String[] args) throws IOException,FileNotFoundException {
	System.out.println("Using Byte Streams");
	String pathString="Eswaran.txt";
	 File  file1=new File(pathString);
	 if(!(file1.exists())) {
		 file1.createNewFile();
	 }
	 System.out.println(file1.getAbsolutePath());
	FileInputStream f1=new FileInputStream(pathString);
	FileOutputStream f1O=new FileOutputStream(file1);
    f1O.write(23); 
    String textToWrite = "Hello, World!";
    byte[] bytes = textToWrite.getBytes();
    f1O.write(bytes);
    for (byte b : bytes) {
		System.out.println((char)b);
	}
int a=f1.read();
	System.out.println(a);
	f1.close();
	f1O.close();
	
}
	
	
	
}
