import java.util.Scanner;

public class Goel_MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define the original story with placeholders
        String story = "Once upon a time, <name> found a magical <noun>.\n"
        + "They decided to <verb> it, and it turned out to be very <adjective>.\n"
        + "In the end, they discovered that the magic lasted for <number> days!";

        // Display the original story
        System.out.println("Original Mad Lib:");
        System.out.println(story);
        System.out.println();

        // Prompt the user for inputs
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();
        
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();

        // Replace <name>
        int nameSpot = story.indexOf("<name>");
        String beforeName = story.substring(0, nameSpot);
        String afterName = story.substring(nameSpot + "<name>".length());
        story = beforeName + name + afterName;

        // Replace <noun>
        int nounSpot = story.indexOf("<noun>");
        String beforeNoun = story.substring(0, nounSpot);
        String afterNoun = story.substring(nounSpot + "<noun>".length());
        story = beforeNoun + noun + afterNoun;

        // Replace <verb>
        int verbSpot = story.indexOf("<verb>");
        String beforeVerb = story.substring(0, verbSpot);
        String afterVerb = story.substring(verbSpot + "<verb>".length());
        story = beforeVerb + verb + afterVerb;

        // Replace <adjective>
        int adjSpot = story.indexOf("<adjective>");
        String beforeAdj = story.substring(0, adjSpot);
        String afterAdj = story.substring(adjSpot + "<adjective>".length());
        story = beforeAdj + adjective + afterAdj;

        // Replace <number>
        int numSpot = story.indexOf("<number>");
        String beforeNum = story.substring(0, numSpot);
        String afterNum = story.substring(numSpot + "<number>".length());
        story = beforeNum + number + afterNum;

        // Display the completed story
        System.out.println("\nHere's your mad lib story:");
        System.out.println(story);

        scanner.close();
    }
}
