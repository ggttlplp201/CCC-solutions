package ccc.senior;

import java.util.*;

public class CCC13S3 {
    static int win;

    static void main() {
        Scanner in = new Scanner(System.in);
        int team = in.nextInt();
        int g = in.nextInt();
        int[] points = new int[4];
        boolean[][] played = new boolean[4][4];
        for (int i = 0; i < g; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int aScore = in.nextInt();
            int bScore = in.nextInt();
            played[a - 1][b - 1] = true;
            played[b - 1][a - 1] = true;
            if (aScore > bScore) {
                points[a - 1] += 3;
            } else if (bScore > aScore) {
                points[b - 1] += 3;
            } else {
                points[a - 1]++;
                points[b - 1]++;
            }
        }
        backTrack(team, g, points, played);
        System.out.println(win);
    }

    private static void backTrack(int team, int g, int[] points, boolean[][] played) {
        if (g == 6) {
            if (teamIsWinner(team, points)) {
                win++;
            }
            return;
        }
        for (int i = 0; i < played.length; i++) {
            for (int j = i + 1; j < played[i].length; j++) {
                if (!played[i][j]) {
                    played[i][j] = true;
                    played[j][i] = true;
                    points[i] += 3;
                    backTrack(team, g + 1, points, played);
                    points[i] -= 3;
                    points[j] += 3;
                    backTrack(team, g + 1, points, played);
                    points[j] -= 3;
                    points[i]++;
                    points[j]++;
                    backTrack(team, g + 1, points, played);
                    points[i]--;
                    points[j]--;
                    played[i][j] = false;
                    played[j][i] = false;
                    return;
                }
            }
        }
    }

    private static boolean teamIsWinner(int team, int[] points) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int point : points) {
            arr.add(point);
        }
        Collections.sort(arr);
        return points[team - 1] == arr.get(arr.size() - 1) && !Objects.equals(arr.get(arr.size() - 1), arr.get(arr.size() - 2));
    }
}
