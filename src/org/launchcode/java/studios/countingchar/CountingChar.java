package org.launchcode.java.studios.countingchar;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;

public class CountingChar {
    public static void main(String[] args) throws IOException {
 //= "If the product of two terms is zero then common " +
//                "sense says at least one of the two terms has to be zero to start with. " +
//                "So if you move all the terms over to one side, you can put the quadratics into " +
//                "a form that can be factored allowing that side of the equation to equal zero. " +
//                "Once you’ve done that, it’s pretty straightforward from there.";
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a string:");
//        exampleSentence = input.nextLine();

        //Import file to read
        String content = Files.readString(Paths.get("C:/","file.txt"), StandardCharsets.UTF_8);


        char[] charactersInString = content.toCharArray();
        HashMap<Character, Integer> charCountObj = new HashMap<Character, Integer>();

        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < charactersInString.length; i++) {
            if (new String(alphabet).indexOf(Character.toLowerCase(charactersInString[i])) != -1) {
                if (!charCountObj.containsKey(Character.toLowerCase(charactersInString[i]))) {
                    charCountObj.put(Character.toLowerCase(charactersInString[i]), 1);
                } else {
                    charCountObj.put(Character.toLowerCase(charactersInString[i]), charCountObj.get(Character.toLowerCase(charactersInString[i]))+1);
                }
            }
        }

        for (Character i : charCountObj.keySet()) {
            System.out.println(i + " : " + charCountObj.get(i));
        }

    }
}
