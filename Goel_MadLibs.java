
import java.util.Scanner;

public class Goel_MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();

        String story =  "I went to the zoo to see a " + noun + ". "
                + "There were people " + verb + " around the enclosure, "
                + "which made the " + adjective + " apes go bananas. ";

        System.out.println("\nHere is the Mad Libs story:\n");
        System.out.println(story);
    }
}




























/*
import java.util.Scanner;

public class Nayak_MadLibs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Original Mad Lib story
        String story = "I went to the zoo to see a <noun>. "
                + "There were people <verb> around the enclosure, "
                + "which made the <adjective> apes go <adverb>. "
                + "Then a <noun> started to <verb> near the <adjective> gate.";

        // Display original story
        System.out.println("Original Mad Lib:");
        System.out.println(story);
        System.out.println();

        // Get user input
        System.out.print("Enter a noun: ");
        String noun1 = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb1 = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective1 = scanner.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = scanner.nextLine();

        System.out.print("Enter another noun: ");
        String noun2 = scanner.nextLine();

        System.out.print("Enter another verb: ");
        String verb2 = scanner.nextLine();

        System.out.print("Enter another adjective: ");
        String adjective2 = scanner.nextLine();

        // Replace one part of speech at a time
        story = story.replaceFirst("<noun>", noun1);
        story = story.replaceFirst("<verb>", verb1);
        story = story.replaceFirst("<adjective>", adjective1);
        story = story.replaceFirst("<adverb>", adverb);
        story = story.replaceFirst("<noun>", noun2);
        story = story.replaceFirst("<verb>", verb2);
        story = story.replaceFirst("<adjective>", adjective2);

        // Display completed Mad Lib
        System.out.println();
        System.out.println("Completed Mad Lib:");
        System.out.println(story);

        scanner.close();
    }
}

*/