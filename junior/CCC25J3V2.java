package ccc.junior;

import java.util.*;

public class CCC25J3V2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String s = in.next();
            StringBuilder out = new StringBuilder();
            int sum = 0;
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (Character.isLetter(c)) {
                    if (Character.isUpperCase(c)) {
                        out.append(c);
                    }
                    continue;
                }
                if (c == '-' || Character.isDigit(c)) {
                    int sign = 1;
                    if (c == '-') {
                        sign = -1;
                        j++;
                    }
                    int num = 0;
                    while (j < s.length() && Character.isDigit(s.charAt(j))) {
                        num = num * 10 + (s.charAt(j) - '0');
                        j++;
                    }
                    sum += sign * num;
                    j--;
                }
            }
            out.append(sum);
            System.out.println(out);
        }
    }
}
