package day_51;
 import java.io.*;
public class Code3 {
	public static void main(String[] args) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"))) {
        // Writing lines of text to the file
        writer.write("Hello, this is line 1.");
        writer.newLine(); // Adding a newline character
        writer.write("And this is line 2.");
        writer.newLine(); // Adding a newline character
        System.out.println("File written successfully.");
    } catch (IOException e) {
        e.printStackTrace();
    }

    // Reading from the file using BufferedReader
    try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
        String line;
        System.out.println("Contents read from the file:");
        // Reading and printing each line from the file
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }}
}
