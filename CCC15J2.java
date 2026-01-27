package ccc;

import java.util.*;

public class CCC15J2 {
    static void main() {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int happy = 0;
        int sad = 0;
        for (int i = 0; i < word.length() - 2; i++) {
            if (word.substring(i, i + 3).equals(":-)")) {
                happy += 1;
            }
        }
        for (int i = 0; i < word.length() - 2; i++) {
            if (word.substring(i, i + 3).equals(":-(")) {
                sad += 1;
            }
        }
        if (happy == 0 && sad == 0) {
            System.out.println("none");
        } else if (happy > sad) {
            System.out.println("happy");
        } else if (sad > happy) {
            System.out.println("sad");
        } else {
            System.out.println("unsure");
        }
    }
}
