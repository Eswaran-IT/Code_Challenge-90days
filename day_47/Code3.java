package day_47;
import java.util.HashMap;
import java.util.Map;

public class Code3 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);

        System.out.println("Value for key 'two': " + hashMap.get("two"));
        System.out.println("Contains key 'four': " + hashMap.containsKey("four"));
        hashMap.remove("two");
        System.out.println("Contains key 'two' after removal: " + hashMap.containsKey("two"));

        System.out.println("All keys: " + hashMap.keySet());
        System.out.println("All values: " + hashMap.values());
    }
}
