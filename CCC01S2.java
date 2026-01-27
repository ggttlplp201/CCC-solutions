package ccc;

import java.util.*;

public class CCC01S2 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        int[][] board = new int[10][10];
        int curR = 4;
        int curC = 4;
        board[curR][curC] = start;
        char dir = 'l';
        // 1 up 2 down 3 left 4 right
        for (int i = start; i < end; i++) {
//            print2d(board);
            dir = direction(board, curR, curC, dir);
            if (dir == 'u') {
                curR--;
                start++;
                board[curR][curC] = start;
            }
            if (dir == 'd') {
                curR++;
                start++;
                board[curR][curC] = start;
            }
            if (dir == 'l') {
                curC--;
                start++;
                board[curR][curC] = start;
            }
            if (dir == 'r') {
                start++;
                curC++;
                board[curR][curC] = start;
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != 0) {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }

    }

    private static void print2d(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static char direction(int[][] board, int curR, int curC, char dir) {
        // 1 up 2 down 3 left 4 right
        if (dir == 'd' && board[curR][curC + 1] == 0) {
            return 'r';
        }
        if (dir == 'l' && board[curR + 1][curC] == 0) {
            return 'd';
        }
        if (dir == 'u' && board[curR][curC - 1] == 0) {
            return 'l';
        }
        if (dir == 'r' && board[curR - 1][curC] == 0) {
            return 'u';
        }
        return dir;
    }
}
