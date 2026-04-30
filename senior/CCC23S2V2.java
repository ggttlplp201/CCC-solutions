package ccc.senior;

import java.io.IOException;
import java.io.*;
import java.util.*;

public class CCC23S2V2 {
    static int[] mountains;
    static int[] res;
    static int n;

    static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        if (n <= 1) {
            System.out.println(0);
            return;
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        mountains = new int[n];
        for (int i = 0; i < n; i++) {
            mountains[i] = Integer.parseInt(st.nextToken());
        }
        res = new int[n + 1];
        Arrays.fill(res, Integer.MAX_VALUE);
        solve(n, mountains);
        for (int i = 1; i <= n; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static void solve(int N, int[] mountains) {
        for (int i = 0; i < mountains.length - 1; i++) {
            twoPointer(i, i);
            twoPointer(i, i + 1);
        }

    }

    public static void twoPointer(int left, int right) {
        int cur = 0;
        while (left >= 0 && right < n) {
            cur += Math.abs(mountains[left] - mountains[right]);
            if (res[right - left + 1] > cur) {
                res[right - left + 1] = cur;
            }
            left--;
            right++;
        }
    }
}
