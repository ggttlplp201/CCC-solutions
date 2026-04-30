package ccc.senior;

import java.util.*;

public class CCC11S2 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int counter = 0;
        String[] arr = new String[x];
        String[] arr2 = new String[x];
        for (int i = 0; i < x; i++) {
            arr[i] = in.next();
        }
        for (int i = 0; i < x; i++) {
            arr2[i] = in.next();
        }
        for (int i = 0; i < x; i++) {
            if (Objects.equals(arr[i], arr2[i])) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
