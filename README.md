# Mad Libs Programming Project

## Project Overview

This project is a Java-based Mad Libs generator. The program will ask the user for different types of words, such as nouns, verbs, and adjectives, and insert those words into a story template.

The goal of the project is to demonstrate:

- User input
- String manipulation
- Methods/functions
- Arrays
- Conditional statements
- Loops
- Team collaboration
- GitHub version control

---

## Team Goal

Our goal is for all five team members to contribute meaningfully to the project.

Each person will:

- Complete a specific part of the program
- Make multiple meaningful GitHub commits
- Help test the final program
- Review another team member's work
- Understand how the completed program works
- Stay actively involved during class

This will help maximize points in:

- Time on Task
- Concept Mastery
- Evidence of Work
- In-Class Participation

---

# Team Roles

## Person 1 - User Input Developer

### Responsibilities

Person 1 will create the part of the program that collects words from the user.

Tasks include:

- Create the `getWord()` method
- Use `Scanner` to collect input
- Ask the user for nouns, verbs, and adjectives
- Prevent empty answers
- Test user input

### Example Contributions

```java
public static String getWord(Scanner scanner, String wordType)
```

### Example GitHub Commits

- `Add Scanner input method`
- `Add empty input validation`
- `Test user word collection`

---

## Person 2 - Story Generation Developer

### Responsibilities

Person 2 will create the Mad Libs story templates.

Tasks include:

- Create the `generateStory()` method
- Insert user words into stories
- Create multiple story templates
- Make sure the stories display correctly
- Include a story with at least 5-7 substitutions

### Example Contributions

```java
public static String generateStory(String[] words, int choice)
```

### Example GitHub Commits

- `Create Mad Libs story generator`
- `Add zoo story template`
- `Add seven word story template`
- `Fix story formatting`

---

## Person 3 - Main Program and Menu Developer

### Responsibilities

Person 3 will connect the different parts of the program together.

Tasks include:

- Create the story selection menu
- Write or organize the `main()` method
- Connect input collection and story generation
- Add a replay feature
- Make sure the program runs from beginning to end

### Example Contributions

```java
public static int chooseStory(Scanner scanner)
```

### Example GitHub Commits

- `Add story selection menu`
- `Connect methods in main`
- `Add play again feature`
- `Improve program flow`

---

## Person 4 - Testing and Quality Assurance

### Responsibilities

Person 4 will test the program and help fix problems.

Tasks include:

- Test all story options
- Test the required teacher examples
- Check for input problems
- Fix bugs
- Improve code comments
- Check program formatting

### Required Test Cases

Test Case 1:

```text
The <noun> <verb> across the <adjective> pond
```

Test Case 2:

```text
I went to the zoo to see a <noun>.
There were people <verb> around the enclosure
which made the <adjective> apes go bananas.
```

### Example GitHub Commits

- `Test pond story`
- `Test zoo story`
- `Fix invalid menu input`
- `Improve code comments`
- `Fix story output formatting`

---

## Person 5 - Documentation and GitHub Manager

### Responsibilities

Person 5 will manage documentation and help organize the repository.

Tasks include:

- Create and update `README.md`
- Add project milestones
- Add screenshots
- Organize the GitHub repository
- Check that everyone's commits are visible
- Improve output formatting in the Java program
- Check final submission requirements

### Example GitHub Commits

- `Create README`
- `Add project milestones`
- `Add screenshots`
- `Document team responsibilities`
- `Improve console output formatting`

---

# Project Milestones

## Milestone 1 - Repository Setup

- [ ] Create shared GitHub repository
- [ ] Add all five team members
- [ ] Create `LastName_MadLibs.java`
- [ ] Create `README.md`
- [ ] Create GitHub Project board

Responsible:

**Person 3 and Person 5**

---

## Milestone 2 - User Input

- [ ] Import `Scanner`
- [ ] Create input collection method
- [ ] Ask for different word types
- [ ] Test input
- [ ] Add input validation

Responsible:

**Person 1**

---

## Milestone 3 - Story Generator

- [ ] Create story templates
- [ ] Insert user-provided words
- [ ] Include 5-7 substitutions
- [ ] Test story formatting

Responsible:

**Person 2**

---

## Milestone 4 - Program Integration

- [ ] Create story selection menu
- [ ] Connect all methods
- [ ] Add replay option
- [ ] Make program run correctly from start to finish

Responsible:

**Person 3**

---

## Milestone 5 - Testing

- [ ] Test Story 1
- [ ] Test Story 2
- [ ] Test 5-7 word story
- [ ] Check blank inputs
- [ ] Check menu choices
- [ ] Fix bugs
- [ ] Review program as a group

Responsible:

**Person 4 and Entire Team**

---

## Milestone 6 - Documentation

- [ ] Finish README
- [ ] Add screenshots
- [ ] Describe programming approach
- [ ] Document team responsibilities
- [ ] Check GitHub commit history

Responsible:

**Person 5**

---

## Milestone 7 - Final Review

Before submission, the entire group will check:

- [ ] Program compiles
- [ ] Program runs without errors
- [ ] All required test cases work
- [ ] At least 5-7 word substitutions are included
- [ ] Comments explain important code
- [ ] README is complete
- [ ] Screenshots are included
- [ ] Every member has meaningful commits
- [ ] Repository link is shared correctly

Responsible:

**All Team Members**

---

# GitHub Commit Strategy

Every team member should make several meaningful commits using their own GitHub account.

Avoid commit messages such as:

```text
update
stuff
changes
fixed
code
```

Instead, use descriptive commit messages.

Examples:

```text
Add Scanner input collection method
Add seven word story template
Connect story generator to main method
Fix invalid menu selection
Add README project milestones
```

Each member should aim to make around **2-4 meaningful commits** during the project.

The goal is not to create unnecessary commits. Each commit should represent actual progress.

---

# Pair Programming and Collaboration

To demonstrate concept mastery, team members should also work together instead of only completing separate tasks.

Each member should:

- Review another person's code
- Explain their code to a teammate
- Help test another feature
- Give feedback
- Participate in debugging
- Understand the final program

Example:

Person 1 can explain how `Scanner` works to Person 5.

Person 2 can review Person 3's program flow.

Person 3 can help Person 4 reproduce a bug.

Person 4 can test Person 2's story templates.

Person 5 can review comments and documentation with Person 1.

---

# GitHub Project Board

We will use a GitHub Project board with these columns:

```text
To Do
In Progress
Testing
Done
```

Example tasks:

- Create repository
- Create input method
- Create story generator
- Add story selection menu
- Add replay option
- Test teacher examples
- Fix bugs
- Add screenshots
- Complete README
- Final project review

Each task should be assigned to the appropriate team member.

---

# Individual Success Checklist

Each team member should be able to answer yes to the following before submission:

- [ ] I contributed code or another meaningful project feature.
- [ ] I made multiple GitHub commits.
- [ ] My commit messages clearly describe my work.
- [ ] I stayed involved during class.
- [ ] I reviewed another person's work.
- [ ] I helped test the program.
- [ ] I understand how the Mad Libs program works.
- [ ] I can explain my contribution to the teacher.

---

# Final Team Goal

By dividing the project into clear roles while still collaborating, every team member can show evidence of work and demonstrate programming knowledge.

The final project should show that all five team members contributed, communicated, tested the program, and helped produce a working Mad Libs generator.