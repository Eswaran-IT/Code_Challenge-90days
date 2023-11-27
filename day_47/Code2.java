package day_47;

public class Code2 {
	public static void main(String[] args) {
		System.out.println("Count words");
		System.out.println(compress(new char[] {'a','a','b','b'}));
	}
	 static   public int compress(char[] chars) {
	        int writeIndex = 0;

	        for (int i = 0; i < chars.length; i++) {
	            char currentChar = chars[i];
	            int count = 1;

	            // Count consecutive occurrences
	            while (i + 1 < chars.length && chars[i] == chars[i + 1]) {
	                count++;
	                i++;
	            }

	           chars[writeIndex++] = currentChar;

	             if (count > 1) {
	                char[] countChars = Integer.toString(count).toCharArray();
	                for (char c : countChars) {
	                    chars[writeIndex++] = c;
	                }
	            }
	        }

	        return writeIndex;
	    
	}

}
