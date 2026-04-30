package ccc.senior;

import java.util.*;

public class CCC04S1 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            String a = input.next();
            String b = input.next();
            String c = input.next();
            boolean result = isFixFree(a, b, c);
            if (result) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }

    private static boolean isFixFree(String a, String b, String c) {
        if (a.startsWith(b) || a.startsWith(c) || a.endsWith(b) || a.endsWith(c)) {
            return false;
        } else if (b.startsWith(a) || b.startsWith(c) || b.endsWith(a) || b.endsWith(c)) {
            return false;
        } else if (c.startsWith(a) || c.startsWith(b) || c.endsWith(a) || c.endsWith(b)) {
            return false;
        }
        return true;
    }
}
