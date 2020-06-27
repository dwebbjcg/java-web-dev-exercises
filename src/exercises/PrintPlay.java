package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintPlay {

    public static void main(String[] args) {

        ArrayList<String> printPlay = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String searchWord;

        printPlay.add("Discover");
        printPlay.add("Taste");
        printPlay.add("Spicy");
        printPlay.add("Antioxidants");
        printPlay.add("Tires");

        System.out.println("Enter a word length (or ENTER to finish):");

        do {
            searchWord = input.nextLine();

            if (!searchWord.equals("")) {
                System.out.println(input);
            }

        } while(!searchWord.equals(""));

        for (String word : printPlay) {
            if ( word.length() == 5) {
                System.out.println(input);
            }
        }
    }
}