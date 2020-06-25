package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] varArray = {1, 1, 2, 3, 5, 8, 6, 4, 1, 7, 9};
        //print each element
        for (int element : varArray) {
            System.out.println(element);
        }

        System.out.println("----------------------------------------------------------");

        //print each odd element
        for (int element : varArray) {
            if (element % 2 != 0) {
                System.out.println(element);
            }
        }

        //part 3 of exercise
        String str = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] strArray;
        strArray = str.split("\\.");
        System.out.println(Arrays.toString(strArray));
    }
}
