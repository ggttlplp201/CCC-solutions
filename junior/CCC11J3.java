package ccc.junior;

import java.util.*;

public class CCC11J3 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int count = 2;
        while (x >= y && x >= 0 && y >= 0) {
            count = count + 1;
            int c = x - y;
            x = y;
            y = c;
        }
        System.out.println(count);
    }
}
