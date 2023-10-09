package day_4;

public class Ternaryoperator {
  public static void main(String[] args) {
	System.out.println("Use ternary operator to find biggest num among three num");
	int a=2000,b=100,c=624;
	String num=(a>b && a>c)?"A":b>a && b>c?"B":"C";
	System.out.println(num);
}
}
