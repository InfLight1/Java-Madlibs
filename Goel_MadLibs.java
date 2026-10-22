// Import the Scanner class to read user input
import java.util.Scanner;

public class Goel_MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define the original story with placeholders
        String originalStory = "Once upon a time, <name> found a magical <noun>.\n"
        + "They decided to <verb> it, and it turned out to be very <adjective>.\n"
        + "In the end, they discovered that the magic lasted for <number> days!";

        // Display the original story
        System.out.println("Original Mad Lib:");
        System.out.println(originalStory);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user for a noun
        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();

        // Prompt the user for a verb
        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        // Prompt the user for an adjective
        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();
        
        // Prompt the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // The final story with user inputs included 
        String story =  "Once upon a time, " + name + " found a magical " + noun + ".\n" +
                       "They decided to " + verb + " it, and it turned out to be very " + adjective + ".\n" +
                       "In the end, they discovered that the magic lasted for " + number + " days!";

        System.out.println("\nHere is the Mad Libs story:\n");
        System.out.println(story);
    }
}
