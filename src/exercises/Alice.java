package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a search term");

        String searchTerm = input.nextLine().toLowerCase();

        String firstSentence = "Alice was beginning to get very " +
                "tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had " +
                "peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";
        String lowercaseFirstSentence = firstSentence.toLowerCase();

        if (lowercaseFirstSentence.contains(searchTerm)) {
            firstSentence = firstSentence.substring(0, lowercaseFirstSentence.indexOf(searchTerm)) + firstSentence.substring(lowercaseFirstSentence.indexOf(searchTerm)+1 +searchTerm.length());
            System.out.println("The search term was located at index: " + lowercaseFirstSentence.indexOf(searchTerm) + " and has a length of " + searchTerm.length() + ".");
            System.out.println(firstSentence);
        } else System.out.println("The sentence does not contain " + searchTerm + ".");


    }
}
