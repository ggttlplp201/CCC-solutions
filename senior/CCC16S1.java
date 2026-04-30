package ccc.senior;

import java.util.*;

public class CCC16S1 {
    static void main() {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        if (a1.length != b1.length) {
            System.out.println("N");
        }
        int count = 0;
        int wildcards = 0;
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < b1.length; j++) {
                if (a1[i] == b1[j]) {
                    a1[i] = '-';
                    b1[j] = '-';
                    count++;
                    break;
                } else if (b1[j] == '*') {
                    wildcards++;
                    b1[j] = '-';
                }
            }
        }
        if (count == a1.length - wildcards) {
            System.out.println('A');
        } else {
            System.out.println('N');
        }
    }
}
