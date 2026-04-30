package ccc.senior;

import java.util.*;

public class CCC20S2 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] graph = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = in.nextInt();
            }
        }
        bfs(graph, m, n);

    }

    private static void bfs(int[][] graph, int m, int n) {
        ArrayList<pair>[] adj = new ArrayList[1000001];
        for (int i = 0; i < 1000001; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                int num = (r + 1) * (c + 1);
                adj[num].add(new pair(r, c));
            }
        }

        Queue<pair> q = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        q.add(new pair(0, 0));
        visited[0][0] = true;
        while (q.size() > 0) {
            pair v = q.remove();
            if (v.x == m - 1 && v.y == n - 1) {
                System.out.println("yes");
                return;
            }
            int coordinate = graph[v.x][v.y];
            for (pair neighbour : adj[coordinate]) {
                if (!visited[neighbour.x][neighbour.y]) {
                    q.add(neighbour);
                    visited[neighbour.x][neighbour.y] = true;
                }
            }
        }
        System.out.println("no");
    }

    static class pair {
        int x;
        int y;

        pair(int x, int y) {
            this.x = x;
            this.y = y;

        }
    }
}
