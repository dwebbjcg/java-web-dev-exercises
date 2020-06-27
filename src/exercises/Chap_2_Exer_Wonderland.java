package exercises;

import java.util.Scanner;

public class Chap_2_Exer_Wonderland {
    public static void main(String[] args) {

    String wonderland = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: " +
     "once or twice she had peeped into the book her sister was reading, " +
      "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
       "thought Alice 'without pictures or conversation?' ";

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter word to search:");
        String searchTerm = input.nextLine().toLowerCase();

        if (wonderland.toLowerCase().contains(searchTerm.toLowerCase())) {
            String wonderlandEdit = wonderland.replace(searchTerm, "");

                System.out.println("Your search term was first found at index " + wonderland.indexOf(searchTerm)
               + ", and its length is " + searchTerm.length() + " characters.");
                System.out.println(wonderlandEdit);
            } else {
                System.out.println("Search term not found. Try again.");
        }
    }
}