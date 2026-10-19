# Java Mad Libs

A console-based Mad Libs generator written in Java. The program asks the player
for six words or phrases, then inserts them into the two story templates from
the assignment.

## Run the program

From this folder, compile and run:

```text
javac Goel_MadLibs.java
java Goel_MadLibs
```

The program requests, in order:

1. A noun, a past-tense verb, and an adjective for the pond story.
2. A noun, a verb ending in `-ing`, and an adjective for the zoo story.

Example output after entering `frog`, `hopped`, `sparkling`, `penguin`,
`dancing`, and `sleepy`:

```text
The frog hopped across the sparkling pond.
I went to the zoo to see a penguin. There were people dancing around the enclosure which made the sleepy apes go bananas.
```

## Approach and book concepts

The program uses `Scanner` to collect complete lines of user input and stores
each answer in a `String`. The `getWord` method handles input collection and
repeats the prompt when an answer is blank. The `createStories` method keeps
story generation separate from input and combines the answers with the fixed
story text using string concatenation. This applies the course book concepts of
variables for storing values, methods for separating program tasks, user input,
and string manipulation. The input method accepts phrases as well as single
words, and the program uses six substitutions across the two provided stories,
meeting the assignment's requirement of at least 5–7 substitutions.

## Project milestones and progress

| Milestone | Status |
| --- | --- |
| Set up the shared GitHub repository | Complete |
| Implement both story templates from the assignment | Complete |
| Collect six user inputs and reject blank answers | Complete |
| Compile and test both story outputs with sample inputs | Complete |
| Add all five group members' names | In progress |
| Create or link the GitHub Project board and its milestones | To do |
| Capture and add a screenshot of a completed run | To do |

### Assignment test cases

The program implements both provided story patterns:

- `The <noun> <verb> across the <adjective> pond`
- `I went to the zoo to see a <noun>. There were people <verb> around the enclosure which made the <adjective> apes go bananas.`

## Screenshot

The screenshot is still to be added. Before submitting, run the program in a
terminal, enter sample words, and save a screenshot that shows the prompts and
generated stories as `screenshots/madlibs-run.png`. Once the image is added,
include it here:

```markdown
![Mad Libs program run](screenshots/madlibs-run.png)
```

## Team and submission

This is a five-person group project:

- Rudra Goel
- Group member 2 — add name
- Group member 3 — add name
- Group member 4 — add name
- Group member 5 — add name

**Shared repository:** [InfLight1/Java-Madlibs](https://github.com/InfLight1/Java-Madlibs)

**GitHub Project board:** Add the board link here when it is available.
