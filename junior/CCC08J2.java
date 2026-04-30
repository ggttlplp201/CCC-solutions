package ccc.junior;

import java.util.*;

public class CCC08J2 {
    static void main() {
        Scanner in = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");
        while (true) {
            int b = in.nextInt();
            int n = in.nextInt();
            if (b == 4 && n == 1) {
                break;
            }
            swapLetters(arr, b, n);
        }
        String arrString = String.join(" ", arr);
        System.out.println(arrString);
    }

    private static void swapLetters(ArrayList<String> arr, int b, int n) {
        if (b == 1) {
            for (int i = 0; i < n; i++) {
                String temp = arr.get(0);
                arr.add(temp);
                arr.remove(0);
            }
        }
        if (b == 2) {
            for (int i = 0; i < n; i++) {
                String temp = arr.get(4);
                arr.remove(temp);
                arr.add(0, temp);
            }
        }
        if (b == 3) {
            for (int i = 0; i < n; i++) {
                Collections.swap(arr, 0, 1);
            }
        }
    }
}
