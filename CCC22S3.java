package ccc;

import java.io.IOException;
import java.io.*;
import java.util.*;

public class CCC22S3 {
    static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        int[] sample = new int[n];
        long min = n;
        long max = 0;
        boolean possible = true;
        for (int i = 1; i <= n; i++) {
            if (i < m) {
                max += i;
            } else {
                max += m;
            }
        }
        if (k < min || k > max) {
            pw.println(-1);
            possible = false;
        } else {
            long target = k - n;
            sample[0] = 1;
            for (int i = 1; i < n; i++) {
                if (target == 0) {
                    sample[i] = sample[i - 1];
                } else if (i < m && target >= i) {
                    sample[i] = i + 1;
                    target -= i;
                } else if (i < m) {
                    sample[i] = sample[(int) (i - target - 1)];
                    target = 0;
                } else if (target >= m) {
                    sample[i] = i % m + 1;
                    target -= m - 1;
                } else {
                    sample[i] = sample[(int) (i - target - 1)];
                    target = 0;
                }
            }
        }


        if (possible) {
            for (int i = 0; i < n; i++) {
                pw.print(sample[i] + " ");
            }
        }


        pw.close();
    }
}
