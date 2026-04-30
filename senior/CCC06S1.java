package ccc.senior;

import java.util.*;

public class CCC06S1 {
    static void main() {
        Scanner in = new Scanner(System.in);
        String attribute = in.next();
        String attribute2 = in.next();
        int pairs = in.nextInt();
        for (int i = 0; i < pairs; i++) {
            String traits = in.next();
            boolean isPossible = true;
            for (int j = 0; j < traits.length(); j++) {
                if (Character.isUpperCase(traits.charAt(j))) {
                    if (!attribute.contains(traits.substring(j, j + 1)) && (!attribute2.contains(traits.substring(j, j + 1)))) {
                        isPossible = false;
                        break;
                    }
                } else {
                    if (!attribute.contains(traits.substring(j, j + 1)) || (!attribute2.contains(traits.substring(j, j + 1)))) {
                        isPossible = false;
                        break;
                    }
                }
            }
            if (isPossible) {
                System.out.println("Possible baby.");
            } else {
                System.out.println("Not their baby!");
            }
        }
    }
}
