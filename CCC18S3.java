package ccc;

import java.util.*;

public class CCC18S3 {
    static int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static int n, m, row, col;
    static int[][] emptyCell;
    static char[][] grid;
    static boolean[][] isWall;

    static void main() {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        grid = new char[n][m];
        emptyCell = new int[n][m];
        isWall = new boolean[n][m];
        initGrid(in, n, m, grid, emptyCell, isWall);
        camera(n, m, grid, isWall);
        bfs(row, col, isWall);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (emptyCell[i][j] != 0) {
                    System.out.println(emptyCell[i][j]);
                }
            }
        }
    }

    private static void camera(int n, int m, char[][] grid, boolean[][] isWall) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 'C') {
                    int newR;
                    int newC;
                    newC = j;
                    while (grid[i][newC] != 'W') {
                        isWall[i][newC] = !isConveyor(i, newC, grid);
                        newC++;
                    }
                    newC = j - 1;
                    while (grid[i][newC] != 'W') {
                        isWall[i][newC] = !isConveyor(i, newC, grid);
                        newC--;
                    }
                    newR = i;
                    while (grid[newR][j] != 'W') {
                        isWall[newR][j] = !isConveyor(newR, j, grid);
                        newR++;
                    }
                    newR = i - 1;
                    while (grid[newR][j] != 'W') {
                        isWall[newR][j] = !isConveyor(newR, j, grid);
                        newR--;
                    }
                }
            }
        }
    }

    private static void bfs(int row, int col, boolean[][] isWall) {
        Queue<rc> q = new LinkedList<>();
        if (!isWall[row][col]) {
            q.add(new rc(row, col, 0));
            isWall[row][col] = true;
        }
        while (q.size() > 0) {
            rc cur = q.remove();
            for (int i = 0; i < 4; i++) {
                int nextR = cur.r + dir[i][0];
                int nextC = cur.c + dir[i][1];
                if (isWall[nextR][nextC]) {
                    continue;
                }
                int[] direction = move(nextR, nextC);
                nextR = direction[0];
                nextC = direction[1];
                if (nextR == -1) {
                    continue;
                }
                if (emptyCell[nextR][nextC] == -1) {
                    emptyCell[nextR][nextC] = cur.steps + 1;
                    q.add(new rc(nextR, nextC, cur.steps + 1));
                }
            }
        }
    }

    private static int[] move(int nextR, int nextC) {
        int[] d = {-1, -1};
        if (isWall[nextR][nextC]) {
            return d;
        } else {
            isWall[nextR][nextC] = true;
            switch (grid[nextR][nextC]) {
                case 'L':
                    return move(nextR, nextC - 1);
                case 'R':
                    return move(nextR, nextC + 1);
                case 'U':
                    return move(nextR - 1, nextC);
                case 'D':
                    return move(nextR + 1, nextC);
                default:
                    d[0] = nextR;
                    d[1] = nextC;
                    return d;
            }
        }
    }

    private static void initGrid(Scanner in, int n, int m, char[][] grid, int[][] emptyCell, boolean[][] isWall) {
        for (int i = 0; i < n; i++) {
            String component = in.next();
            grid[i] = component.toCharArray();
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 'S') {
                    row = i;
                    col = j;
                } else if (grid[i][j] == '.') {
                    emptyCell[i][j] = -1;
                } else if (grid[i][j] == 'W') {
                    isWall[i][j] = true;
                }
            }
        }
    }

    private static boolean isConveyor(int r, int c, char[][] grid) {
        return grid[r][c] == 'U' || grid[r][c] == 'D' || grid[r][c] == 'L' || grid[r][c] == 'R';
    }

    static class rc {
        int r, c, steps;

        public rc(int r, int c, int steps) {
            this.r = r;
            this.c = c;
            this.steps = steps;
        }
    }
}
