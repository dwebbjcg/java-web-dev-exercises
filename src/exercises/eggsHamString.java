package exercises;

import java.util.Arrays;

public class eggsHamString {

    public static void main(String[] args) {

        String str = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        String[] wordArray = str.split("\\.");
        System.out.println(Arrays.toString(wordArray));
        System.out.println(wordArray.length);
    }
}
