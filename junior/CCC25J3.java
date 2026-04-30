package ccc.junior;

import java.util.*;

public class CCC25J3 {
    public static void main(String[] args) {
        //remove lower case, add all integers
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        boolean flag = true;
        int sum = 0;
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String s = in.next();
            for (int j = 0; j < s.length(); j++) {
                sb2.setLength(0);
                if (Character.isLetter(s.charAt(j))) {
                    if (Character.isUpperCase(s.charAt(j))) {
                        sb.append(s.charAt(j));
                    }
                } else if (Character.isDigit(s.charAt(j))) {
                    flag = false;
                    int k = j;
                    boolean digit = Character.isDigit(s.charAt(k + 1));
                    do {
                        if (Character.isLetter(s.charAt(k)) || k >= s.length() - 1) {
                            j = k - 1;
                            break;
                        }
                        sb2.append(s.charAt(k));
                        k++;
                    } while (j < s.length() - 1 && digit);
                } else if (s.charAt(j) == '-') {
                    int k = j + 1;
                    boolean digit;
                    if (k + 1 >= s.length()) {
                        digit = Character.isDigit(s.charAt(k));
                    } else {
                        digit = Character.isDigit(s.charAt(k + 1));

                    }
                    do {
                        if (Character.isLetter(s.charAt(k)) || k >= s.length() - 1) {
                            j = k - 1;
                            break;
                        }
                        sb2.append(s.charAt(k));
                        k++;
                    } while (j < s.length() - 1 && digit);
                }
                if (!sb2.isEmpty()) {
                    if (!flag) {
                        sum += Integer.parseInt(String.valueOf(sb2));
                    } else {
                        sum -= Integer.parseInt(String.valueOf(sb2));
                        if (j++ >= s.length()) {
                            break;
                        }
                    }
                    flag = true;
                }
            }
            sb.append(sum);
            System.out.println(sb);
            sb.setLength(0);
        }
    }
}

