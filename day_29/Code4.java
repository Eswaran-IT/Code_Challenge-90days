package day_29;

public class Code4 {
public static void main(String[] args) {
	System.out.println("Pre defined regex");
	 String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
     String email = "user@example.com";

     if (email.matches(emailPattern)) {
         System.out.println("Valid email address: " + email);
     } else {
         System.out.println("Invalid email address: " + email);
     }
}
}
