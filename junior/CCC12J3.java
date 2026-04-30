package ccc.junior;

import java.util.*;

public class CCC12J3 {
    static void main() {
        Scanner input = new Scanner(System.in);
        String a = "";
        String b = "";
        String c = "";
        int k = input.nextInt();
        for (int i = 0; i < k; i++) {
            a = a + "*";
            b = b + "x";
            c = c + " ";
        }
        for (int i = 0; i < k; i++) {
            System.out.println(a + b + a);
        }
        for (int i = 0; i < k; i++) {
            System.out.println(c + b + b);
        }
        for (int i = 0; i < k; i++) {
            System.out.println(a + c + a);
        }
    }
}
