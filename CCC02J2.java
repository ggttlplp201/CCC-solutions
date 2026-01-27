package ccc;

import java.util.*;

public class CCC02J2 {
    static void main() {
        Scanner in = new Scanner(System.in);
        while (true) {
            String word = in.nextLine();
            if (word.equals("quit!")) {
                break;
            }
            String result = convert(word);
            System.out.println(result);
        }
    }

    private static String convert(String word) {
        if (word.length() <= 4) {
            return word;
        }

        if (word.endsWith("or") && !("aeiouy".contains(word.substring(word.length() - 3, word.length() - 2)))) {
            // color
            // colour
            return word.substring(0, word.length() - 1) + "ur";
        }
        return word;
    }
}
