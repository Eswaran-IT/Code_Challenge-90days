package day_49;

class Code3 {
public static void main(String[] args) {
	System.out.println("Palindrome");
	String str="Malayalam";
	System.out.println(palindrom(str));
}
public static Boolean palindrom(String s) {
      System.out.println("Palindrome");
      StringBuilder sBuilder=new StringBuilder(s.toLowerCase());
      sBuilder.reverse();
      return (sBuilder.toString().equals(s.toLowerCase()))?true:false;
}
}

