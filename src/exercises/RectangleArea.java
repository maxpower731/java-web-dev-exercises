package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length?: ");
        Double length = input.nextDouble();
        System.out.println("What is the height?: ");
        Double width = input.nextDouble();

        System.out.println("The area is: " + (width * length));
    }
}
