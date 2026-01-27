package ccc;

import java.util.*;

public class CCC24J3 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] scores = new Integer[n];
        for (int i = 0; i < n; i++) {
            scores[i] = in.nextInt();
        }
        Arrays.sort(scores, Collections.reverseOrder());
        int cnt = 0;
        int target = 0;
        for (int i = 0; i < n; i++) {
            if (cnt == 2) {
                System.out.print(scores[i] + " ");
                target = scores[i];
                break;
            }
            if (!Objects.equals(scores[i + 1], scores[i])) {
                cnt++;
            }
        }
        int times = 0;
        for (int i = 0; i < n; i++) {
            if (scores[i] == target) {
                times++;
            }
        }
        System.out.print(times);
    }
}

