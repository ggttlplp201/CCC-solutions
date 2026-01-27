package ccc;

import java.util.*;

public class CCC05S1 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for (int i = 0; i < x; i++) {
            String s = input.next();
            String result = fixPhoneNumber(s);
            System.out.println(result);
        }
    }

    private static String fixPhoneNumber(String s) {
        s = s.replace("-", "");
        s = s.substring(0, 10);
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                String x = letterToDigit(s, i);
                newS += x;
            } else {
                newS += s.charAt(i);
            }
        }
        newS = newS.substring(0, 3) + "-" + newS.substring(3, 6) + "-" + newS.substring(6);
        return newS;
    }

    private static String letterToDigit(String newS, int i) {
        if ("ABC".contains(newS.substring(i, i + 1))) {
            return "2";
        } else if ("DEF".contains(newS.substring(i, i + 1))) {
            return "3";
        } else if ("GHI".contains(newS.substring(i, i + 1))) {
            return "4";
        } else if ("JKL".contains(newS.substring(i, i + 1))) {
            return "5";
        } else if ("MNO".contains((newS.substring(i, i + 1)))) {
            return "6";
        } else if ("PQRS".contains((newS.substring(i, i + 1)))) {
            return "7";
        } else if ("TUV".contains((newS.substring(i, i + 1)))) {
            return "8";
        } else {
            return "9";
        }
    }
}
