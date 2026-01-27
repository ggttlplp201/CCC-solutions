package ccc;

import java.util.*;

public class CCC13J2 {
    static void main() {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        if (word.replaceAll("[IOSHZXN]", "").equals("")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
