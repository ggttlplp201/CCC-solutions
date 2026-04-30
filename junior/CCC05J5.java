package ccc.junior;

import java.util.*;

public class CCC05J5 {
    static void main() {
        Scanner in = new Scanner(System.in);
        while (true) {
            String word = in.next();
            if (word.equals("X")) {
                return;
            }
            if (monkeyWord(word)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean monkeyWord(String word) {
        while (word.contains("ANA") || word.contains("BAS")) {
            word = word.replace("ANA", "A");
            word = word.replace("BAS", "A");
        }
        return word.equals("A");
    }
}
