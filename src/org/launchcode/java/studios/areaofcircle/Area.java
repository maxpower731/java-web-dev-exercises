package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius?: ");
        Double radius = input.nextDouble();
        System.out.println("Area is " + Circle.getArea(radius));
    }
}

