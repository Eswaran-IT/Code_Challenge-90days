package day_50;

@FunctionalInterface
interface MyInterface {
    void printMessage(String message);
}

public class Code1{
    // Static method to be referenced
    static void printStaticMessage(String message) {
        System.out.println("Static Method Reference: " + message);
    }

    public static void main(String[] args) {
        // Lambda expression to implement MyInterface
        MyInterface myLambda = (message) -> System.out.println("Lambda: " + message);

        // Method reference to a static method
        MyInterface myMethodReference = Code1::printStaticMessage;

        // Calling the methods using both lambda expression and method reference
        myLambda.printMessage("Hello Lambda!");
        myMethodReference.printMessage("Hello Method Reference!");
    }
}
