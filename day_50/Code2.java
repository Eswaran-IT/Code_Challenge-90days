/*
 * package day_50;
 * 
 * @FunctionalInterface interface MyInterface { void printMessage(String
 * message); }
 * 
 * class MessagePrinter { // Instance method to be referenced void
 * printInstanceMessage(String message) {
 * System.out.println("Instance Method Reference: " + message); } }
 * 
 * public class Code2 { // Static method to be referenced static void
 * printStaticMessage(String message) {
 * System.out.println("Static Method Reference: " + message); }
 * 
 * public static void main(String[] args) { // Lambda expression to implement
 * MyInterface MyInterface myLambda = (message) -> System.out.println("Lambda: "
 * + message);
 * 
 * // Method reference to a static method MyInterface myStaticMethodReference =
 * Code2::printStaticMessage;
 * 
 * // Creating an instance for the method reference MessagePrinter
 * messagePrinter = new MessagePrinter();
 * 
 * // Method reference to an instance method MyInterface
 * myInstanceMethodReference = messagePrinter::printInstanceMessage;
 * 
 * // Calling the methods using both lambda expression and method references
 * myLambda.printMessage("Hello Lambda!");
 * myStaticMethodReference.printMessage("Hello Static Method Reference!");
 * myInstanceMethodReference.printMessage("Hello Instance Method Reference!"); }
 * }
 * 
 */