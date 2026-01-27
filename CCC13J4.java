package ccc;

import java.util.*;

public class CCC13J4 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int totalNum = in.nextInt();
        int count = 0;
        int sum = 0;
        int[] arr = new int[totalNum];
        for (int i = 0; i < totalNum; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] <= T) {
                count += 1;
                sum += arr[i];
            }
        }
        System.out.println(count);
    }
}
