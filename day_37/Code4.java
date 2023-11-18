package day_37;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Code4 {
    public Code4() {
        System.out.println("Creating an instance of Code4");
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public void printInstance(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        // Static Method Reference
        List<String> words = Arrays.asList("Java", "Method", "References");
        words.forEach(Code4::print);

        // Instance Method Reference
        Code4 example = new Code4();
        words.forEach(example::printInstance);

        // Constructor Method Reference
        Supplier<Code4> constructorReference = Code4::new;
        constructorReference.get();
    }
}
