package ccc;

import java.util.*;

public class CCC16S2 {
    static int sum1;
    static int sum2;

    static void main() {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        if (q == 1) {
            type1(in);
            System.out.println(sum1);
        } else {
            type2(in);
            System.out.println(sum2);
        }
    }

    private static int type2(Scanner in) {
        int n = in.nextInt();
        ArrayList<Integer> dmojistan = new ArrayList<>();
        ArrayList<Integer> pegland = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            dmojistan.add(in.nextInt());
        }
        for (int i = 0; i < n; i++) {
            pegland.add(in.nextInt());
        }
        Collections.sort(dmojistan);
        pegland.sort(Collections.reverseOrder());
        sum2 = 0;
        for (int i = 0; i < dmojistan.size(); i++) {
            sum2 += Math.max(dmojistan.get(i), pegland.get(i));
        }
        return sum2;
        // 1 4 5
        // 6 4 2
    }

    private static int type1(Scanner in) {
        int n = in.nextInt();
        int[] dmojistan = new int[n];
        int[] pegland = new int[n];
        for (int i = 0; i < n; i++) {
            dmojistan[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            pegland[i] = in.nextInt();
        }
        Arrays.sort(dmojistan);
        Arrays.sort(pegland);
        // 1 4 5
        // 2 4 6
        sum1 = 0;
        for (int i = 0; i < dmojistan.length; i++) {
            sum1 += Math.max(dmojistan[i], pegland[i]);
        }
        return sum1;
    }
}
