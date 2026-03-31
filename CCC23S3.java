package ccc;

import java.io.IOException;
import java.io.*;
import java.util.*;

public class CCC23S3 {
    static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        String[][] res = new String[n][m];
        boolean impossible = false;
        if (r > 0 && r < n && c > 0 && c < m) {
            for (int i = 0; i < n; i++) {
                Arrays.fill(res[i], "a");
            }
            for (int i = 0; i < m - c; i++) {
                res[0][i] = "x";
            }
            for (int i = 0; i < n - r; i++) {
                res[i][0] = "x";
            }
        } else if (r == 0) {
            if (c == 0) {
                for (int i = 0; i < n; i++) {
                    Arrays.fill(res[i], "a");
                }
                for (int i = 0; i < m - c; i++) {
                    res[0][i] = "x";
                }
                for (int i = 0; i < n - r; i++) {
                    res[i][0] = "x";
                }
                res[n - 1][0] = "b";
                res[0][m - 1] = "b";
            } else {
                for (int i = 0; i < n; i++) {
                    Arrays.fill(res[i], "a");
                }
                for (int i = 0; i < n; i++) {
                    res[i][m - 1] = "b";
                }
                for (int i = 0; i < m - c; i++) {
                    res[n - 1][i] = "x";
                }
            }
        } else if (r == n) {
            if (c == m) {
                for (int i = 0; i < n; i++) {
                    Arrays.fill(res[i], "a");
                }
            } else {
                for (int i = 0; i < n; i++) {
                    Arrays.fill(res[i], "a");
                }
                if (m % 2 == 0 && (m - c) % 2 != 0) {
                    impossible = true;
                } else {
                    int temp = (m - c) / 2;
                    for (int i = 0; i < temp; i++) {
                        res[n - 1][i] = "x";
                        res[n - 1][m - 1 - i] = "x";
                    }
                    if ((m - c) % 2 == 1) {
                        res[n - 1][(m) / 2] = "x";
                    }
                }
            }
        } else if (c == 0) {
            for (int i = 0; i < n; i++) {
                Arrays.fill(res[i], "a");
            }
            for (int i = 0; i < m; i++) {
                res[n - 1][i] = "b";
            }
            for (int i = 0; i < n - r; i++) {
                res[i][m - 1] = "x";
            }
        } else if (c == m) {
            for (int i = 0; i < n; i++) {
                Arrays.fill(res[i], "a");
            }
            if (n % 2 == 0 && (n - r) % 2 != 0) {
                impossible = true;
            } else {
                int temp = (n - r) / 2;
                for (int i = 0; i < temp; i++) {
                    res[i][m - 1] = "x";
                    res[n - 1 - i][m - 1] = "x";
                }
                if ((n - r) % 2 == 1) {
                    res[(n) / 2][m - 1] = "x";
                }
            }
        }


        if (!impossible) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    pw.print(res[i][j]);
                }
                if (i != n - 1) {
                    pw.println();
                }
            }
        } else {
            pw.println("IMPOSSIBLE");
        }
        pw.close();
    }
}
