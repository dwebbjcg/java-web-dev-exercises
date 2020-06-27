package exercises;

public class ArrayExercises {

    public static void main(String[] args) {

//  Initialize Array

        int[] randArray = {1, 1, 2, 3, 5, 8};

//  Print Array

//        for (int i : randArray) {
//            System.out.println(i);
//        }

//  Make Array print odd numbers

        for (int oneInt : randArray) {
            if (oneInt % 2 == 1) {
                System.out.println(oneInt);
                continue;
            }
        }
    }
}