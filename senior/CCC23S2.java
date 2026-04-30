package ccc.senior;

import java.util.*;

public class CCC23S2 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] m = new int[N];
        for (int i = 0; i < N; i++) {
            m[i] = in.nextInt();
        }
        int[][] map = new int[N][N];
        int[] min = new int[N];
        for (int i = 0; i < N; i++) {
            map[i][0] = 0;
            min[i] = Integer.MAX_VALUE;
        }
        min[0] = 0;
        for (int i = 0; i < N - 1; i++) {
            map[i][1] = Math.abs(m[i] - m[i + 1]);
            min[1] = Math.min(min[1], map[i][1]);
        }
        for (int i = 2; i < N; i++) {
            for (int j = 0; j < N - i; j++) {
                map[j][i] = Math.abs(m[j] - m[j + i]) + map[j + 1][i - 2];
                min[i] = Math.min(min[i], map[j][i]);
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(min[i] + " ");
        }
    }
}
