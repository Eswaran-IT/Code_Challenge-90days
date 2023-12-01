package day_46;
import java.util.HashMap;
import java.util.Map;

public class Code2{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 1, 3, 4, 5, 4, 2};
        System.out.println("Count words");
        Map<Integer, Integer> numberCountMap = new HashMap<>();
        for (int num : array) {
            // If the number is already in the map, increment its count, otherwise set the count to 1
            numberCountMap.put(num, numberCountMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : numberCountMap.entrySet()) {
            System.out.println("Number: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}
