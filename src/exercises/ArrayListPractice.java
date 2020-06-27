package exercises;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> numArrayList = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
        numArrayList.add(i);
    }

        int total = 0;

        for (int number : numArrayList) {
            if (number % 2 == 0) {
                total += number;
            }
        }
//        return total;

        System.out.println("Sum of even numbers: " + total);
        System.out.println(numArrayList);
    }

}
