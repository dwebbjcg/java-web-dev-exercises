package exercises;

import java.util.Scanner;

public class Chap_2_Exer_AreaRect {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter length of rectangle:");
        double length = input.nextInt();
        System.out.println("Please enter width of rectangle:");
        double width = input.nextInt();

        double area = length * width;
        System.out.println("The area of the rectangle is " + area + ".");
    }
}
