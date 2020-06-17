package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean invalidInput;
        Double radius = null;

        do {
            System.out.println("What is the radius?: ");
            try {
                radius = input.nextDouble();
            } catch (Exception e) {
                System.out.println("Enter a valid radius!");
            }

            if (radius < 0) {
                System.out.println("Enter a positive value radius!");
                invalidInput = true;
            } else {
                invalidInput = false;
            }
        } while (invalidInput);

        System.out.println("Area is " + Circle.getArea(radius));
    }
}

