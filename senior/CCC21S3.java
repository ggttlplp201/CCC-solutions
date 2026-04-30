package ccc.senior;

import java.io.IOException;
import java.io.*;
import java.util.*;

public class CCC21S3 {
    static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Pt[] points = new Pt[2 * n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int start = p - d;
            int end = p + d;
            points[i * 2] = new Pt(start, w, true);
            points[i * 2 + 1] = new Pt(end, w, false);
        }

        Arrays.sort(points);


        long leftSum = 0;
        long rightSum = 0;
        long total = 0;
        long minTotal;

        for (Pt point : points) {
            if (point.start && point.pos > points[0].pos) {
                rightSum += point.w;
                total += (point.pos - points[0].pos) * point.w;
            }
            if (!point.start && point.pos < points[0].pos) {
                leftSum += point.w;
                total += (points[0].pos - point.pos) * point.w;
            }
        }
        minTotal = total;

        for (int i = 1; i < points.length; i++) {
            long dist = points[i].pos - points[i - 1].pos;
            long nextSum = total + dist * leftSum - dist * rightSum;
            if (points[i].start) {
                rightSum -= points[i].w;
            } else {
                leftSum += points[i].w;
            }

            total = nextSum;
            minTotal = Math.min(minTotal, total);
        }
        pw.println(minTotal);
        pw.close();
        br.close();
    }

    public static class Pt implements Comparable<Pt> {
        long pos;
        long w;
        boolean start;

        public Pt(long pos, long w, boolean start) {
            this.pos = pos;
            this.w = w;
            this.start = start;
        }

        @Override
        public int compareTo(Pt o) {
            return Long.compare(this.pos, o.pos);
        }
    }
}
