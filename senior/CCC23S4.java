package ccc.senior;

import java.io.IOException;
import java.io.*;
import java.util.*;

public class CCC23S4 {
    static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<long[]>> adj = new ArrayList<>();
        PriorityQueue<long[]> pq = new PriorityQueue<>((o1, o2) -> {
            if (o1[2] != o2[2]) {
                return Long.compare(o1[2], o2[2]);
            } else {
                return Long.compare(o1[3], o2[3]);
            }
        });

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            int l = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            pq.add(new long[]{a, b, l, c});
        }

        long totalCost = 0;
        while (!pq.isEmpty()) {
            long[] temp = pq.poll();
            long start = temp[0];
            long end = temp[1];
            long length = temp[2];
            long cost = temp[3];
            long[] dist = new long[n];
            Arrays.fill(dist, Long.MAX_VALUE);
            PriorityQueue<long[]> q = new PriorityQueue<>(new Comparator<long[]>() {
                @Override
                public int compare(long[] o1, long[] o2) {
                    return Long.compare(o1[0], o2[0]);
                }
            });

            dist[(int) start] = 0;
            q.add(new long[]{0, start});
            while (!q.isEmpty()) {
                long[] cur = q.poll();
                long curPoint = cur[1];
                long curDist = cur[0];
                if (curDist != dist[(int) curPoint]) {
                    continue;
                }
                for (long[] edge : adj.get((int) curPoint)) {
                    if (curDist + edge[1] < dist[(int) edge[0]]) {
                        dist[(int) edge[0]] = curDist + edge[1];
                        q.add(new long[]{dist[(int) edge[0]], edge[0]});
                    }
                }
            }
            if (dist[(int) end] > length) {
                adj.get((int) start).add(new long[]{end, length, cost});
                adj.get((int) end).add(new long[]{start, length, cost});
                totalCost += cost;
            }
        }
        pw.println(totalCost);
        br.close();
        pw.close();
    }
}
