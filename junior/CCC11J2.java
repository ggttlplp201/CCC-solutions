package ccc.junior;

import java.util.*;

public class CCC11J2 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int m = input.nextInt();
        int t = 1;
        int A = -6 * t * t * t * t + h * t * t * t + 2 * t * t + t;
        while (t < m && A > 0) {
            t = t + 1;
            A = -6 * t * t * t * t + h * t * t * t + 2 * t * t + t;
        }
        if (A > 0)
            System.out.println("The balloon does not touch ground in the given time.");
        else if (A <= 0)
            System.out.println("The balloon first touches ground at hour:\n" + t);
    }
}
