package day_10;
import java.io.*;
public class FileOperations {
public static void main(String[] args) throws IOException,FileNotFoundException {
	System.out.println("File operations");
	File f1=new File("File1.txt");
	System.out.println(	f1.getCanonicalPath());
	System.out.println(f1.getAbsolutePath());
	System.out.println(f1.canRead());//no because of physicallly not present
	System.err.println(f1.createNewFile());
	System.out.println(f1.canRead());
	System.out.println(f1.exists());//temp file so false
	System.out.println(f1.getParent());
	System.out.println(f1.isFile());
	System.out.println(f1.length());
	System.out.println(f1.mkdir());
	System.out.println(f1.isDirectory());
	System.out.println(f1.exists());
	System.out.println(f1.delete());
	System.out.println(f1.exists());
}
}
