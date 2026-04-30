package ccc.junior;

import java.util.*;

public class CCC10J2 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int m = input.nextInt();
        for (int n = 1; n < m; n++) {
            if ((x * n) % m == 1) {
                System.out.println(n);
                return;
            }
        }
        System.out.println("No such integer exists.");
    }
}
