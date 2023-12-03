package day_53;

import java.io.Console;

public class Code5 {
	    public static void main(String[] args) {
	  
	       // System.exit(0);
	        long currentTimeMillis = System.currentTimeMillis();
	        System.gc();
	        String javaVersion = System.getProperty("java.version");
	        String homeDirectory = System.getenv("HOME");
	        System.setProperty("custom.property", "customValue");
	        String lineSeparator = System.lineSeparator();
	        Console console = System.console();

	    System.out.println(currentTimeMillis);
	    System.out.println(console);
	    System.out.println(System.getProperties());
	}
}
