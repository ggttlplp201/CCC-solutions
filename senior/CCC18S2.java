package ccc.senior;

import java.util.*;

public class CCC18S2 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] grid = new int[n][n];
        int smallestVal = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = in.nextInt();
                if (grid[i][j] < smallestVal) {
                    smallestVal = grid[i][j];
                }
            }
        }
        if (smallestVal == grid[0][0]) {
            for (int[] ints : grid) {
                for (int anInt : ints) {
                    System.out.print(anInt + " ");
                }
                System.out.println(" ");
            }
        } else if (smallestVal == grid[0][n - 1]) {
            for (int c = 0; c < n; c++) {
                for (int r = 0; r < n; r++) {
                    System.out.print(grid[r][n - 1 - c] + " ");
                }
                System.out.println(" ");
            }
        } else if (smallestVal == grid[n - 1][n - 1]) {
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    System.out.print(grid[n - 1 - r][n - 1 - c] + " ");
                }
                System.out.println(" ");
            }
        } else {
            for (int c = 0; c < n; c++) {
                for (int r = 0; r < n; r++) {
                    System.out.print(grid[n - 1 - r][c] + " ");
                }
                System.out.println(" ");
            }
        }
    }
}
