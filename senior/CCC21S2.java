package ccc.senior;

import java.util.*;

public class CCC21S2 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        int K = in.nextInt();
        in.nextLine();
        char[][] canvas = new char[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                canvas[i][j] = 'B';
            }
        }
        for (int k = 0; k < K; k++) {
            String choice = in.nextLine();
            char direction = choice.charAt(0);
            int index = Integer.parseInt(choice.substring(2)) - 1;
            if (direction == 'R') {
                for (int j = 0; j < N; j++) {
                    if (canvas[index][j] == 'B') {
                        canvas[index][j] = 'G';
                    } else {
                        canvas[index][j] = 'B';
                    }
                }
            } else if (direction == 'C') {
                for (int i = 0; i < M; i++) {
                    if (canvas[i][index] == 'B') {
                        canvas[i][index] = 'G';
                    } else {
                        canvas[i][index] = 'B';
                    }
                }
            }
        }
        int goldCount = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (canvas[i][j] == 'G') {
                    goldCount++;
                }
            }
        }
        System.out.println(goldCount);
    }
}
