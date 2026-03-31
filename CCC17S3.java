package ccc;

import java.io.IOException;
import java.io.*;
import java.util.*;

public class CCC17S3 {
    static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] planks = new int[2001];
        for (int i = 0; i < N; i++) {
            planks[Integer.parseInt(st.nextToken())]++;
        }
        int[] heights = new int[4001];
        for (int i = 1; i <= 2000; i++) {
            if (planks[i] != 0) {
                for (int j = i; j <= 2000; j++) {
                    if (i != j)
                        heights[i + j] += Math.min(planks[i], planks[j]);
                    else
                        heights[2 * i] += planks[i] / 2;
                }
            }
        }
        int best = 0;
        int count = 0;
        for (int i = 1; i <= 4000; i++) {
            if (heights[i] > best) {
                best = heights[i];
                count = 1;
            } else if (heights[i] == best) {
                count++;
            }
        }
        System.out.println(best + " " + count);
    }
}
