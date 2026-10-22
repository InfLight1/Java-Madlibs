// Test program for our story

// Import the Scanner class to read user input
import java.util.Scanner;

public class Goel_MadLibs_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Prompt the user for a noun
        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();

        // Prompt the user for a verb
        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        // Prompt the user for an adjective
        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();


        // The final story with user inputs included 
        String story =  "The " + noun + " " + verb + " across the " + adjective + " pond.";
        String story2 = "I went to the zoo to see a " + noun + ". There were people " + verb + " around the enclosure which made the " + adjective + " apes go bananas.";
        System.out.println("\nHere are the Mad Libs stories:\n");
        System.out.println(story);
        System.out.println(story2);
    }
}

