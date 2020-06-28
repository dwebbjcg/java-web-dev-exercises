package org.launchcode.java.studios.CountingChar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter word(s) to count:");
        String inputString = input.nextLine().toLowerCase().replaceAll("[^a-zA-Z]", "");
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] charInString = inputString.toCharArray();

        for (char c : charInString) {
            if (charCountMap.containsKey(c)) {
                    charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                    charCountMap.put(c, 1);
            }
        }
        for (Map.Entry entry : charCountMap.entrySet()) {
                    System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
