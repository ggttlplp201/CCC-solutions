package ccc.senior;

import java.util.*;

public class CCC14S1 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int m = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for (int i = 1; i <= K; i++) {
            arr.add(i);
        }
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            for (int j = 0; j < arr.size(); j++) {
                if ((j + 1) % a != 0) {
                    arr2.add(arr.get(j));
                }
            }
            arr = arr2;
            arr2 = new ArrayList<>();
        }
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
