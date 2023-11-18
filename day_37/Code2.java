package day_37;

import java.util.function.Predicate;
import java.util.function.Function;

public class Code2 {

    public static void main(String[] args) {
        // Predicate example
        Predicate<Integer> pr = a -> (a > 18);
        System.out.println("Is 30 greater than 18? " + pr.test(30));

        // Function example
        Function<String, String> fun = FunctionInterfaceExample::show;
        System.out.println(fun.apply("Peter"));
    }
}

class FunctionInterfaceExample {
    static String show(String message) {
        return "Hello " + message;
    }
}
