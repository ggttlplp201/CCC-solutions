package ccc;

import java.util.*;

public class CCC13S2 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int maxWeight = in.nextInt();
        int carNums = in.nextInt();
        int[] array = new int[carNums];
        int count = 0;
        for (int i = 0; i < carNums; i++) {
            array[i] = in.nextInt();
        }
        if (array[0] <= maxWeight) {
            count++;
        }
        if (array.length > 1 && array[0] + array[1] <= maxWeight) {
            count++;
        }
        if (array.length > 2 && array[0] + array[1] + array[2] <= maxWeight) {
            count++;
        }
        for (int i = 0; i < array.length - 3; i++) {
            if (array[i] + array[i + 1] + array[i + 2] + array[i + 3] <= maxWeight) {
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
