package day_55;

	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

public class Code1 {
	    public static boolean isValidEmail(String email) {
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	        Pattern pattern = Pattern.compile(emailRegex);
	        Matcher matcher = pattern.matcher(email);
	        return matcher.matches();
	    }

	    public static void main(String[] args) {
	        String[] emails = {"test@example.com", "sampleemail", "user@.com", "another@java.com"};
	        for (String email : emails) {
	            System.out.println(email + " is valid: " + isValidEmail(email));
	        }
	    }
	}
