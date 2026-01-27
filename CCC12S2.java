package ccc;

import java.util.*;

public class CCC12S2 {
    static void main() {
        Scanner input = new Scanner(System.in);
        String aro = input.next();
        int len = aro.length();
        int sum = 0;
        for (int i = 0; i < len; i += 2) {
            char A = aro.charAt(i);
            char R = aro.charAt(i + 1);
            int aNumber = Integer.parseInt("" + A);
            int rNumber = romanToNum(R);
            if ((i + 3 < len && romanToNum(aro.charAt(i + 3)) > rNumber)) {
                sum -= aNumber * rNumber;
            } else {
                sum += aNumber * rNumber;
            }
        }
        System.out.println(sum);
    }

    private static int romanToNum(char R) {
        if (R == 'M') {
            return 1000;
        }
        if (R == 'D') {
            return 500;
        }
        if (R == 'C') {
            return 100;
        }
        if (R == 'L') {
            return 50;
        }
        if (R == 'X') {
            return 10;
        }
        if (R == 'V') {
            return 5;
        }
        return 1;
    }
}
