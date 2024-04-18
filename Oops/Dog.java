package Oops;

//public class Dog {
	
//}
import java.util.Scanner;

class Dog {
    private String name;
    private String breed;

    // Constructor to initialize name and breed
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter method for breed
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for breed
    public String tmgBreed() {
        return breed;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Receive input for the first dog
        System.out.println("Enter the name of the first dog:");
        String name1 = scanner.nextLine();
        System.out.println("Enter the breed of the first dog:");
        String breed1 = scanner.nextLine();

        // Create the first instance of the Dog class with user input
        Dog dog1 = new Dog(name1, breed1);

        // Receive input for the second dog
        System.out.println("Enter the name of the second dog:");
        String name2 = scanner.nextLine();
        System.out.println("Enter the breed of the second dog:");
        String breed2 = scanner.nextLine();
        scanner.close();

        // Create the second instance of the Dog class with user input
        Dog dog2 = new Dog(name2, breed2);

        // Print the details of both dogs
        System.out.println("\nDog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.tmgBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.tmgBreed());
    }


	
}
