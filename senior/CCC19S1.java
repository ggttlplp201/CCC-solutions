package ccc.senior;

import java.util.*;

public class CCC19S1 {
    static void main() {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        char[] arr = new char[input.length()];
        int HorizontalSum = 0;
        int VerticalSum = 0;
        for (int i = 0; i < input.length(); i++) {
            arr[i] = input.charAt(i);
            if (arr[i] == 'H') {
                HorizontalSum++;
            } else {
                VerticalSum++;
            }
        }
        if (HorizontalSum % 2 == 0 && VerticalSum % 2 == 0) {
            System.out.println(1 + " " + 2);
            System.out.println(3 + " " + 4);
        } else if (HorizontalSum % 2 != 0 && VerticalSum % 2 != 0) {
            System.out.println(4 + " " + 3);
            System.out.println(2 + " " + 1);
        } else if (HorizontalSum % 2 != 0) {
            System.out.println(3 + " " + 4);
            System.out.println(1 + " " + 2);
        } else {
            System.out.println(2 + " " + 1);
            System.out.println(4 + " " + 3);
        }
    }
}
