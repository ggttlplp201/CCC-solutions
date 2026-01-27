package ccc;

import java.util.*;

public class CCC01S2V2 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt() - 1;
        int b = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = a; i < b; i++) {
            arr.add(i);
        }
        Collections.reverse(arr);
        int[][] board = new int[][]{
                {73, 72, 71, 70, 69, 68, 67, 66, 65, 100},
                {74, 43, 42, 41, 40, 39, 38, 37, 64, 99},
                {75, 44, 21, 20, 19, 18, 17, 36, 63, 98},
                {76, 45, 22, 7, 6, 5, 16, 35, 62, 97},
                {77, 46, 23, 8, 1, 4, 15, 34, 61, 96},
                {78, 47, 24, 9, 2, 3, 14, 33, 60, 95},
                {79, 48, 25, 10, 11, 12, 13, 32, 59, 94},
                {80, 49, 26, 27, 28, 29, 30, 31, 58, 93},
                {81, 50, 51, 52, 53, 54, 55, 56, 57, 92},
                {82, 83, 84, 85, 86, 87, 88, 89, 90, 91}
        };
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] += a;
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] > b) {
                    board[i][j] = 0;
                }
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
}
