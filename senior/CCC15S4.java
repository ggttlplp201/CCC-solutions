package ccc.senior;

import java.util.*;
import java.io.*;

public class CCC15S4 {
    static void main() {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();

        List<SeaRoute>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int t = in.nextInt();
            int h = in.nextInt();
            graph[a].add(new SeaRoute(b, t, h));
            graph[b].add(new SeaRoute(a, t, h));
        }
        int A = in.nextInt();
        int B = in.nextInt();

        int[][] dist = new int[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        dist[A][0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(arr -> dist[arr[0]][arr[1]]));
        pq.add(new int[]{A, 0});
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int distTo = current[0];
            int damage = current[1];
            for (SeaRoute route : graph[distTo]) {
                int w = route.to;
                int newDist = dist[distTo][damage] + route.time;
                int newHull = damage + route.hull;
                if (newHull < k && newDist < dist[w][newHull]) {
                    dist[w][newHull] = newDist;
                    pq.add(new int[]{w, newHull});
                }
            }
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i <= k; i++) {
            result = Math.min(result, dist[B][i]);
        }

        System.out.println(result == Integer.MAX_VALUE ? -1 : result);
    }

    static class SeaRoute {
        int to, time, hull;

        public SeaRoute(int to, int time, int hull) {
            this.to = to;
            this.time = time;
            this.hull = hull;
        }
    }
}
