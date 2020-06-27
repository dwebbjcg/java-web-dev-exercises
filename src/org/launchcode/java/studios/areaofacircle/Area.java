package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input; // Comments do not have to start at the beginning of a line.

        input = new Scanner(System.in);
        System.out.println("Please enter radius: ");
        double radius = input.nextDouble(); //Declares the 'name' variable and initializes it with text from the command line.
        input.close();

        double area = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is: " + area);


    }
}
