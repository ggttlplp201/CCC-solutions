package ccc;

import java.util.*;

public class CCC07J3 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int[] arr = {100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            arr[x - 1] = 0;
        }
        int f = in.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / (10 - n);
        if (f > avg) {
            System.out.println("deal");
        } else {
            System.out.println("no deal");
        }
    }
}
