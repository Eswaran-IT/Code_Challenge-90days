package day_19;

public class Code5 {
    // Define an enum for traffic light colors
    enum Color {
        RED, YELLOW, GREEN
    }

    public static void main(String[] args) {
        // Simulate a traffic light sequence
        Color currentColor = Color.RED;

        for (int i = 0; i < 3; i++) {
            System.out.println("Traffic light is " + currentColor);
            switch (currentColor) {
                case RED:
                    currentColor = Color.GREEN;
                    break;
                case YELLOW:
                    currentColor = Color.RED;
                    break;
                case GREEN:
                    currentColor = Color.YELLOW;
                    break;
            }

            // Sleep to simulate a delay
            try {
                Thread.sleep(10000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



}
