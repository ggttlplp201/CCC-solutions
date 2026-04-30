package ccc.senior;

import java.util.*;

public class CCC15S2 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int j = in.nextInt();
        int a = in.nextInt();
        int[] available = new int[j + 1];
        for (int i = 1; i <= j; i++) {
            String input = in.next();
            if (input.equals("S")) {
                available[i] = 1;
            } else if (input.equals("M")) {
                available[i] = 2;
            } else if (input.equals("L")) {
                available[i] = 3;
            }
        }
        int count = 0;
        int size = 0;
        for (int i = 0; i < a; i++) {
            String input = in.next();
            int num = in.nextInt();
            if (input.equals("S")) {
                size = 1;
            } else if (input.equals("M")) {
                size = 2;
            } else if (input.equals("L")) {
                size = 3;
            }
            if (available[num] >= size) {
                count++;
                available[num] = 0;
            }
        }
        System.out.println(count);
    }
}
