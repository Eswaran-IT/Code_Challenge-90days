package day_8;

import java.util.Arrays;

public class Stringoperations {
public static void main(String[] args) {
	System.out.println("String operations");
	String aString=new String();
	String bString=new String();
	aString="Eswaran";
	System.out.println(aString);
	bString="Eswara";
   System.out.println(bString);
   System.out.println(aString);
   System.out.println(aString.compareToIgnoreCase(bString));
   System.out.println(aString);
   System.out.println(aString.contains(bString));

   System.out.println(aString.getClass());
    int a[]= {1,2};
    System.out.println(Arrays.toString(a));
   System.out.println(aString.getBytes());
   System.out.println(aString.contentEquals(bString));
   
   System.out.println(aString.endsWith("n"));
   System.out.println(aString.startsWith("e"));
   String hiString=aString.substring(2,4);
   System.out.println(hiString);
   System.out.println(aString.subSequence(0, 3));
   System.out.println(aString.indent(1));
   System.out.println(aString.indexOf("s"));
   
	    }
	

  
}
