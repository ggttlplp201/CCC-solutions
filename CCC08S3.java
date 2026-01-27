package ccc;

import java.util.*;

public class CCC08S3 {
    static void main() {

        Scanner in = new Scanner(System.in);
        int test_cases = in.nextInt();
        for (int i = 0; i < test_cases; i++) {
            int r = in.nextInt();
            int c = in.nextInt();
            String[][] maze = new String[r + 1][c + 1];
            for (int row = 1; row <= r; row++) {
                String lines = in.next();
                for (int col = 0; col < c; col++) {
                    String symbols = String.valueOf(lines.charAt(col));
                    maze[row][col + 1] = symbols;
                }
            }
            int[][] dist = new int[r + 1][c + 1];
            Queue<Integer> queue_row = new LinkedList<>();
            Queue<Integer> queue_col = new LinkedList<>();
            boolean[][] visited = new boolean[r + 1][c + 1];
            visited[1][1] = true;
            queue_row.add(1);
            queue_col.add(1);
            dist[1][1] = 1;
            while (queue_row.size() > 0) {
                int cur_row = queue_row.remove();
                int cur_col = queue_col.remove();
                String cur = maze[cur_row][cur_col];
                switch (cur) {
                    case "*":
                        break;
                    case "|":
                        if (cur_row + 1 <= r && !visited[cur_row + 1][cur_col] && !maze[cur_row + 1][cur_col].equals("*")) {
                            queue_row.add(cur_row + 1);
                            queue_col.add(cur_col);
                            visited[cur_row + 1][cur_col] = true;
                            dist[cur_row + 1][cur_col] = dist[cur_row][cur_col] + 1;
                        }
                        if (cur_row - 1 >= 1 && !visited[cur_row - 1][cur_col] && !maze[cur_row - 1][cur_col].equals("*")) {
                            queue_row.add(cur_row - 1);
                            queue_col.add(cur_col);
                            visited[cur_row - 1][cur_col] = true;
                            dist[cur_row - 1][cur_col] = dist[cur_row][cur_col] + 1;
                        }
                        break;
                    case "-":
                        if (cur_col + 1 <= c && !visited[cur_row][cur_col + 1] && !maze[cur_row][cur_col + 1].equals("*")) {
                            queue_row.add(cur_row);
                            queue_col.add(cur_col + 1);
                            visited[cur_row][cur_col + 1] = true;
                            dist[cur_row][cur_col + 1] = dist[cur_row][cur_col] + 1;
                        }
                        if (cur_col - 1 >= 1 && !visited[cur_row][cur_col - 1] && !maze[cur_row][cur_col - 1].equals("*")) {
                            queue_row.add(cur_row);
                            queue_col.add(cur_col - 1);
                            visited[cur_row][cur_col - 1] = true;
                            dist[cur_row][cur_col - 1] = dist[cur_row][cur_col] + 1;
                        }
                        break;
                    case "+":
                        if (cur_row + 1 <= r && !visited[cur_row + 1][cur_col] && !maze[cur_row + 1][cur_col].equals("*")) {
                            queue_row.add(cur_row + 1);
                            queue_col.add(cur_col);
                            visited[cur_row + 1][cur_col] = true;
                            dist[cur_row + 1][cur_col] = dist[cur_row][cur_col] + 1;
                        }
                        if (cur_row - 1 >= 1 && !visited[cur_row - 1][cur_col] && !maze[cur_row - 1][cur_col].equals("*")) {
                            queue_row.add(cur_row - 1);
                            queue_col.add(cur_col);
                            visited[cur_row - 1][cur_col] = true;
                            dist[cur_row - 1][cur_col] = dist[cur_row][cur_col] + 1;
                        }
                        if (cur_col + 1 <= c && !visited[cur_row][cur_col + 1] && !maze[cur_row][cur_col + 1].equals("*")) {
                            queue_row.add(cur_row);
                            queue_col.add(cur_col + 1);
                            visited[cur_row][cur_col + 1] = true;
                            dist[cur_row][cur_col + 1] = dist[cur_row][cur_col] + 1;
                        }
                        if (cur_col - 1 >= 1 && !visited[cur_row][cur_col - 1] && !maze[cur_row][cur_col - 1].equals("*")) {
                            queue_row.add(cur_row);
                            queue_col.add(cur_col - 1);
                            visited[cur_row][cur_col - 1] = true;
                            dist[cur_row][cur_col - 1] = dist[cur_row][cur_col] + 1;
                        }
                        break;
                }
            }
            if (visited[r][c]) {
                System.out.println(dist[r][c]);
            } else {
                System.out.println(-1);
            }
        }
    }
}
