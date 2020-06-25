package exercises;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i < 1000000; i++) {
            numbers.add(i);
        }

        System.out.println(addEven(numbers));
    }

    public static int addEven(ArrayList<Integer> num) {
        int sum = 0;
        for (int i = 0; i < num.size(); i++){
            if (num.get(i) % 2 == 0) {
                sum += num.get(i);
            }
        }
        return sum;
    }
}
