package day_55;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Code5 {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String phoneRegex = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] phoneNumbers = {"123-456-7890", "(123) 456-7890", "invalid-number", "9876543210"};
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber + " is valid: " + isValidPhoneNumber(phoneNumber));
        }
    }
}
