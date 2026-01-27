package ccc;

import java.util.*;

public class CCC11J4 {
    public static void print2d(boolean[][] board, int cr, int cc) {
        System.out.println("---------------");
        for (int r = 0; r < 50; r++) {
            for (int c = 160; c < 230; c++) {
                if (r == cr && c == cc) {
                    System.out.print("*");
                } else {
                    if (board[r][c]) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println("---------------");
        System.out.println();
    }

    static void main() {
        Scanner in = new Scanner(System.in);
        boolean[][] board = new boolean[200][401];
        setBoard(board);
        ArrayList<String> dirs = new ArrayList<String>();
        ArrayList<Integer> steps = new ArrayList<Integer>();
        while (in.hasNext()) {
            String dir = in.next();
            int step = in.nextInt();
            if (dir.equals("q")) {
                break;
            } else {
                dirs.add(dir);
                steps.add(step);
            }
        }
        int cr = 4;
        int cc = 199;
        boolean isDanger = false;
        for (int i = 0; i < dirs.size(); i++) {
//            print2d(board, cr, cc);
            if (dirs.get(i).equals("u")) {
                for (int j = 0; j < steps.get(i); j++) {
                    if (board[cr - 1][cc]) {
                        isDanger = true;
                    }
                    cr--;
                    board[cr][cc] = true;
                }
            } else if (dirs.get(i).equals("d")) {
                for (int j = 0; j < steps.get(i); j++) {
                    if (board[cr + 1][cc]) {
                        isDanger = true;
                    }
                    cr++;
                    board[cr][cc] = true;

                }
            } else if (dirs.get(i).equals("l")) {
                for (int j = 0; j < steps.get(i); j++) {
                    if (board[cr][cc - 1]) {
                        isDanger = true;
                    }
                    cc--;
                    board[cr][cc] = true;
                }
            } else {
                for (int j = 0; j < steps.get(i); j++) {
                    if (board[cr][cc + 1]) {
                        isDanger = true;
                    }
                    cc++;
                    board[cr][cc] = true;

                }
            }
            if (isDanger) {
                System.out.println((cc - 200) + " " + (-cr - 1) + " DANGER");
                break;
            } else {
                System.out.println((cc - 200) + " " + (-cr - 1) + " safe");
            }
        }
    }

    private static void setBoard(boolean[][] board) {
//        int cr = 4;
//        int cc = 199;
        board[4][199] = true;
        board[5][199] = true;
        board[6][199] = true;
        board[6][200] = true;
        board[6][201] = true;
        board[6][202] = true;
        board[6][203] = true;
        board[6][204] = true;
        board[6][205] = true;
        board[6][206] = true;
        board[6][207] = true;
        board[5][207] = true;
        board[4][207] = true;
        board[3][207] = true;
        board[2][207] = true;
        board[2][206] = true;
        board[2][205] = true;
        board[3][205] = true;
        board[4][205] = true;
        board[4][204] = true;
        board[4][203] = true;
        board[3][203] = true;
        board[2][203] = true;
        board[2][202] = true;
        board[2][201] = true;
        board[2][200] = true;
        board[1][200] = true;
        board[0][200] = true;
    }
}
