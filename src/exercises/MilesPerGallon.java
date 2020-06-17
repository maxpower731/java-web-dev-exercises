package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many gallons?: ");
        Double gallons = input.nextDouble();
        System.out.println("How many miles were travelled?: ");
        Double miles = input.nextDouble();
        System.out.println("You averaged " + miles/gallons + " MPG.");
    }
}
