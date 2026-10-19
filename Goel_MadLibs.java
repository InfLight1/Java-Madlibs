import java.util.Scanner;

public class Goel_MadLibs {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to Mad Libs!");
            System.out.println("Fill in the words below to create two silly stories.\n");

            String firstNoun = getWord(scanner, "Enter a noun for the pond story: ");
            String pastTenseVerb = getWord(scanner, "Enter a past-tense verb: ");
            String firstAdjective = getWord(scanner, "Enter an adjective for the pond story: ");

            String zooNoun = getWord(scanner, "Enter a noun for the zoo story: ");
            String actionVerb = getWord(scanner, "Enter a verb ending in -ing: ");
            String zooAdjective = getWord(scanner, "Enter an adjective for the apes: ");

            System.out.println("\nYour Mad Libs stories:");
            System.out.println(createStories(
                    firstNoun,
                    pastTenseVerb,
                    firstAdjective,
                    zooNoun,
                    actionVerb,
                    zooAdjective));
        }
    }

    // Reads a complete word or phrase and asks again if the input is blank.
    private static String getWord(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String answer = scanner.nextLine().trim();
            if (!answer.isEmpty()) {
                return answer;
            }
            System.out.println("Please enter a word or phrase.");
        }
    }

    // Substitutes the six answers into the assignment's two story templates.
    private static String createStories(
            String firstNoun,
            String pastTenseVerb,
            String firstAdjective,
            String zooNoun,
            String actionVerb,
            String zooAdjective) {
        return "The " + firstNoun + " " + pastTenseVerb + " across the "
                + firstAdjective + " pond.\n"
                + "I went to the zoo to see a " + zooNoun
                + ". There were people " + actionVerb
                + " around the enclosure which made the " + zooAdjective
                + " apes go bananas.";
    }
}
