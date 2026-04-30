package ccc.junior;

import java.util.*;

public class CCC10J5V2 {

    static void main() {
        Scanner in = new Scanner(System.in);
        int startX = in.nextInt() - 1;
        int startY = in.nextInt() - 1;
        int endX = in.nextInt() - 1;
        int endY = in.nextInt() - 1;
        hop(startX, startY, endX, endY);
    }

    private static void hop(int startX, int startY, int endX, int endY) {
        Queue<Pair> q = new LinkedList();
        boolean[][] visited = new boolean[8][8];
        int[][] distTo = new int[8][8];
        visited[startX][startY] = true;
        distTo[startX][startY] = 0;
        q.add(new Pair(startX, startY));
        int[][] d = {{2, 1},
                {2, -1},
                {1, 2},
                {1, -2},
                {-1, 2},
                {-1, -2},
                {-2, 1},
                {-2, -1}};
        while (q.size() > 0) {
            Pair pair = q.remove();
            int curX = pair.x;
            int curY = pair.y;
            if (curX == endX && curY == endY) {
                System.out.println(distTo[endX][endY]);
                return;
            }
            for (int i = 0; i < 8; i++) {
                int nextX = curX + d[i][0];
                int nextY = curY + d[i][1];
                if (nextX >= 0 && nextX < 8 && nextY >= 0 && nextY < 8 && !visited[nextX][nextY]) {
                    q.add(new Pair(nextX, nextY));
                    visited[nextX][nextY] = true;
                    distTo[nextX][nextY] = distTo[curX][curY] + 1;
                }
            }
        }
        System.out.println(distTo[endX][endY]);
    }

    static class Pair {
        int x, y;

        Pair(int x1, int y1) {
            this.x = x1;
            this.y = y1;
        }
    }
}
