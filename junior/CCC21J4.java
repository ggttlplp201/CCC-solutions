package ccc.junior;

import java.util.*;

public class CCC21J4 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int large = 0, med = 0;
        String input = in.next();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'L') large++;
            else if (input.charAt(i) == 'M') med++;
        }
        int mInL = 0, notL = 0;
        for (int i = 0; i < large; i++) {
            if (input.charAt(i) != 'L') notL++;
            if (input.charAt(i) == 'M') mInL++;
        }
        int lInM = 0, notM = 0;
        for (int i = large; i < large + med; i++) {
            if (input.charAt(i) != 'M') notM++;
            if (input.charAt(i) == 'L') lInM++;
        }
        System.out.println(notL + notM - Math.min(mInL, lInM));
    }
}
