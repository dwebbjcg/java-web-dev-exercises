package exercises;

import java.util.Scanner;

public class Chap_2_Exer_MPG {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter miles driven:");
        double miles = input.nextInt();
        System.out.println("Please enter gallons of fuel used:");
        double fuel = input.nextInt();

        double MPG = miles / fuel;
        System.out.println("Your fuel economy is " + MPG + " miles per gallon.");
    }
}
