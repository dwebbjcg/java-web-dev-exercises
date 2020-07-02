package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Chap_3_Exer_ArrList_PrintPlay {

    public static void main(String[] args) {

        ArrayList<String> printPlay = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length (or ENTER to finish):");
        int searchTerm = input.nextInt();

        printPlay.add("Discover");
        printPlay.add("Taste");
        printPlay.add("Spicy");
        printPlay.add("Antioxidants");
        printPlay.add("Tires");
        printPlay.add("Hats");
        printPlay.add("Dad");

        for (String word : printPlay) {
            if (word.length() == searchTerm) {
                System.out.println(word);
                break;
         } // else {
//                System.out.println("No results found. Please try again.");
//            }
        }
    }
}