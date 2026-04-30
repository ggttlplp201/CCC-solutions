package ccc.junior;

import java.util.*;

public class CCC10J5 {
    public static int steps = Integer.MAX_VALUE;

    static void main() {
        Scanner in = new Scanner(System.in);
        int startX = in.nextInt() - 1;
        int startY = in.nextInt() - 1;
        int endX = in.nextInt() - 1;
        int endY = in.nextInt() - 1;
        int[][] board = new int[8][8];
        int stepsCount = 0;
        backTracking(startX, startY, board, endX, endY, stepsCount);
        System.out.println(steps);
    }

    private static void backTracking(int curX, int curY, int[][] board, int endX, int endY, int stepsCount) {
        if (stepsCount >= 10) {
            return;
        }
        if (curX == endX && curY == endY) {
            if (stepsCount < steps) {
                steps = stepsCount;
            }
            return;
        }
        int[][] directions = {
                {2, 1},
                {2, -1},
                {1, 2},
                {1, -2},
                {-2, 1},
                {-2, -1},
                {-1, 2},
                {-1, -2}
        };
        for (int[] direction : directions) {
            int nextX = curX + direction[0];
            int nextY = curY + direction[1];
            if (nextX >= 0 && nextX < 8 && nextY >= 0 && nextY < 8 && board[nextX][nextY] != 1) {
                board[nextX][nextY] = 1;
                backTracking(nextX, nextY, board, endX, endY, stepsCount + 1);
                board[nextX][nextY] = 0;
            }
        }
    }
}
