package day_36;
import java.util.regex.*;

public class Code1 {
public static void main(String[] args) {
	
	        String emailAddress = "user@example.com";

	        if (isValidEmail(emailAddress)) {
	            System.out.println("The email address is valid.");
	        } else {
	            System.out.println("The email address is not valid.");
	        }
	    
   
}

	    private static boolean isValidEmail(String email) {
	        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
	        Pattern pattern = Pattern.compile(emailPattern);
	        Matcher matcher = pattern.matcher(email);
	        return matcher.matches();
	    
	    
	    
	    }
	}


