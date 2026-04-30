package ccc.junior;

import java.util.*;

public class CCC01J1 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                System.out.println(getX(n, i));
            } else if (i > n / 2) {
                System.out.println(getX(n, n - i));
            }
        }
        System.out.println(getX(n));
    }

    private static String getX(int n) {
        return "*" + " ".repeat(2 * n - 2) + "*";
    }

    private static String getX(int n, int i) {
        return "*".repeat(2 * i + 1) + " ".repeat((2 * (n - 2 * i) - 2)) + "*".repeat(2 * i + 1);
    }
}
