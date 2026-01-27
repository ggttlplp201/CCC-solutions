package ccc;

import java.util.*;

public class CCC04J4 {
    static void main() {
        Scanner in = new Scanner(System.in);
        String keyWord = in.nextLine();
        String word = in.nextLine();
        String newString = "";
        String res = "";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                newString += word.charAt(i);
            }
        }
        for (int i = 0; i < newString.length(); i++) {
            char letter = newString.charAt(i);
            int j = i % keyWord.length();
            char key = keyWord.charAt(j);
            int shift = key - 'A';
            int shiftedLetter = letter + shift;
            while (shiftedLetter > 'Z') {
                shiftedLetter -= 26;
            }
            res += (char) (shiftedLetter);
        }
        System.out.println(res);
    }
}
