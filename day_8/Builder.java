package day_8;

public class Builder {
public static void main(String[] args) {
	System.out.println("String Builder");
	StringBuilder actorBuilder=new StringBuilder();
	System.out.println(actorBuilder.capacity());
	actorBuilder.trimToSize();
	System.out.println(actorBuilder.capacity());
	actorBuilder.append("Hello");
	actorBuilder.append(1);
	System.out.println(actorBuilder);
	System.out.println(actorBuilder.charAt(4));
actorBuilder.setLength(50);
System.out.println(actorBuilder.capacity());
System.out.println(actorBuilder.length());
actorBuilder.append("hhhhhhhhhhhhhhhhiiiiiiiiiiiiiiiiiiiiiiiiiiiiiibadsbbvcxsdfghbvcxdfgbvcdfg");
System.out.println(actorBuilder);
System.out.println(actorBuilder.delete(0, actorBuilder.length()));
System.out.println(actorBuilder.capacity());
System.out.println(actorBuilder.length());

}
}
