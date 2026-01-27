package ccc;

import java.util.Scanner;

public class CCC05J4 {
    public static void print2d(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("___________________");
    }

    static void main() {
        Scanner in = new Scanner(System.in);
        int C = in.nextInt();
        int R = in.nextInt();
        int removeC = in.nextInt();
        int removeR = in.nextInt();
        int steps = in.nextInt();
        int curC = removeC;
        int curR = 0;
        boolean[][] board = new boolean[R][C];
        cutOut(removeR, removeC, board, R, C);
        board[curR][curC] = true;
//        print2d(board);
        for (int i = 0; i < steps; i++) {
//            print2d(board);
            if (curC >= board[0].length / 2) {
                if (checkRC(curC + 1, curR, board)) {
                    curC++;
                    board[curR][curC] = true;
                } else if (checkRC(curC, curR + 1, board)) {
                    curR++;
                    board[curR][curC] = true;
                } else if (checkRC(curC - 1, curR, board)) {
                    curC--;
                    board[curR][curC] = true;
                } else if (checkRC(curC, curR - 1, board)) {
                    curR--;
                    board[curR][curC] = true;
                } else {
                    break;
                }
            } else {
                if (checkRC(curC - 1, curR, board)) {
                    curC--;
                    board[curR][curC] = true;
                } else if (checkRC(curC, curR - 1, board)) {
                    curR--;
                    board[curR][curC] = true;
                } else if (checkRC(curC + 1, curR, board)) {
                    curC++;
                    board[curR][curC] = true;
                } else if (checkRC(curC, curR + 1, board)) {
                    curR++;
                    board[curR][curC] = true;
                } else {
                    break;
                }
            }
        }
        System.out.println(curC + 1);
        System.out.println(curR + 1);
    }

    private static boolean checkRC(int curC, int curR, boolean[][] board) {
        return (curR >= 0 && curR < board.length && curC >= 0 && curC < board[0].length && !board[curR][curC]);
    }

    private static void cutOut(int removeR, int removeC, boolean[][] board, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i + 1 <= removeR || i + 1 > r - removeR) {
                    if (j + 1 <= removeC || j + 1 > c - removeC) {
                        board[i][j] = true;
                    }
                }
            }
        }
    }
}
