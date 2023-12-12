package day_59;

	// Define the Animal interface
	interface Animal {
	    void makeSound();   // Method to make a sound
	    void move();        // Method to move
	}

	// Implement the Animal interface in the Dog class
	class Dog implements Animal {
	    @Override
	    public void makeSound() {
	        System.out.println("Dog barks!");
	    }

	    @Override
	    public void move() {
	        System.out.println("Dog runs.");
	    }

	    // Dog-specific method
	    public void fetch() {
	        System.out.println("Dog fetches the ball.");
	    }
	}

	// Implement the Animal interface in the Cat class
	class Cat implements Animal {
	    @Override
	    public void makeSound() {
	        System.out.println("Cat meows!");
	    }

	    @Override
	    public void move() {
	        System.out.println("Cat walks gracefully.");
	    }

	    // Cat-specific method
	    public void scratch() {
	        System.out.println("Cat scratches.");
	    }
	}

	// Main class to test the Animal interface and its implementations

public class Code5 {
	    public static void main(String[] args) {
	        // Create instances of Dog and Cat
	        Dog myDog = new Dog();
	        Cat myCat = new Cat();

	        // Do's and Don'ts using the Animal interface
	        System.out.println("Do's and Don'ts with Dogs:");
	        doAnimalThings(myDog);

	        System.out.println("\nDo's and Don'ts with Cats:");
	        doAnimalThings(myCat);
	    }

	    // Method that works with any object implementing the Animal interface
	    private static void doAnimalThings(Animal animal) {
	        // Do's
	        animal.makeSound();
	        animal.move();

	        // Don'ts - Avoid invoking class-specific methods directly through the interface reference
	        // For example, uncommenting the line below will result in a compilation error
	        // animal.fetch();

	        // If you know the specific type, you can cast and access class-specific methods
	        if (animal instanceof Dog) {
	            ((Dog) animal).fetch();
	        } else if (animal instanceof Cat) {
	            ((Cat) animal).scratch();
	        }
	    }
	

}
