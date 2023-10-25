package day_16;

public class Code1 {

	public static void main(String[] args) {
		System.out.println("Strings");
		StringBuilder sBuilder=new StringBuilder(4);
		System.out.println(sBuilder.capacity());
		sBuilder.append("abcd");
		System.out.println(sBuilder.capacity());
		sBuilder.append(false);
		System.out.println(sBuilder.capacity());
		sBuilder.append(34);
		System.out.println(sBuilder.capacity());
		sBuilder.append(3.5);
		System.out.println(sBuilder);
		System.out.println(sBuilder.indexOf("b"));
		System.out.println(sBuilder.capacity());
		System.out.println(sBuilder.length());
		sBuilder.trimToSize();
		System.out.println(sBuilder.capacity());
		
	}
	
	
	
}
