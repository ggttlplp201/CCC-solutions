package ccc.junior;

import java.io.*;

public class CCC15J5 {
    static int sum = 0;

    static void main() throws IOException {
        //Scored 8/15
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        br.close();
        int prev = 1;
        int cur = 1;
        backTracking(n, k, cur, prev);
        pr.println(sum);
        pr.close();
    }

    private static void backTracking(int n, int k, int cur, int prev) {
        if (cur == k && n >= prev) {
            sum++;
        } else {
            for (int i = prev; i <= n; i++) {
                backTracking(n - i, k, cur + 1, i);
            }
        }
    }
}
