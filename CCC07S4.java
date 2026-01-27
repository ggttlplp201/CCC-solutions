package ccc;

import java.util.*;

public class CCC07S4 {
    static int counter = 0;

    static void main() {
        //Scored 30/50
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            points.add(new ArrayList<Integer>());
        }
        while (true) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (a == 0 && b == 0) {
                break;
            } else {
                points.get(a - 1).add(b - 1);
            }
        }
        backTracking(points, 0, n - 1);
        System.out.println(counter);
    }

    private static void backTracking(ArrayList<ArrayList<Integer>> points, int current, int end) {
        if (current == end) {
            counter++;
        }
        for (int i = 0; i < points.get(current).size(); i++) {
            ArrayList<Integer> neighbours = points.get(current);
            backTracking(points, neighbours.get(i), end);
        }
    }
}
