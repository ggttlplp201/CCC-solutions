package ccc.junior;

import java.util.*;

public class CCC03J1 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int s = input.nextInt();
        int h = input.nextInt();
        String space = " ";
        for (int i = 1; i <= t; i++) {
            System.out.println("*" + space.repeat(s) + "*" + space.repeat(s) + "*");
        }
        System.out.println("*".repeat(3 + 2 * s));
        for (int i = 1; i <= h; i++) {
            System.out.println(space.repeat(1 + s) + "*");
        }
    }
}
